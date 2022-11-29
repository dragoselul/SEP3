package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.repositories.CategoryRepository;
import dk.via.nbnp.databaseserver.repositories.ItemRepository;
import dk.via.nbnp.databaseserver.repositories.UserRepository;
import dk.via.nbnp.databaseserver.application.mappers.ItemMapper;
import dk.via.nbnp.databaseserver.protobuf.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@GRpcService
public class ItemService extends ItemServiceGrpc.ItemServiceImplBase {

    @Autowired
    private final ItemRepository itemRepository;
    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final CategoryRepository categoryRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository, UserRepository userRepository, CategoryRepository categoryRepository) {
        this.itemRepository = itemRepository;
        this.userRepository = userRepository;
        this.categoryRepository = categoryRepository;
    }

    // IMPLEMENTED
    @Override
    public void createItem(CreateItemDTO request, StreamObserver<Item> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.Category> categoryResponse = categoryRepository.findById(request.getCategory());
        Optional<dk.via.nbnp.databaseserver.domain.User> daoResponse = userRepository.findById(request.getOwnerId());
        if (daoResponse.isEmpty()) {
            System.out.println("User with this ownerId was not found");
            responseObserver.onError(new Exception("User with this ownerId was not found"));
        } else if (categoryResponse.isEmpty()) {
            System.out.println("There is no such category as \"" + request.getCategory() + "\"");
            responseObserver.onError(new Exception("There is no such category as \"" + request.getCategory() + "\""));
        } else {
            dk.via.nbnp.databaseserver.domain.Item item = ItemMapper.mapCreateDtoToDomain(request, daoResponse.get(), categoryResponse.get());
            item = itemRepository.save(item);
            responseObserver.onNext(ItemMapper.mapDomainToProto(item));
            responseObserver.onCompleted();
        }

    }

    // TODO TO BE TESTED
    @Override
    public void getItems(SearchItemDTO request, StreamObserver<Item> responseObserver) {
        try {
            List<dk.via.nbnp.databaseserver.domain.Item> daoResponse = itemRepository.findAll();
            if (request.getId() == 0
                    && request.getName().isEmpty()
                    && request.getDescription().isEmpty()
                    && request.getCategory().isEmpty()
                    && !request.getStatus()
                    && request.getOwnerId() == 0
                    && request.getMinPrice() == 0
                    && request.getMaxPrice() == Double.MAX_VALUE
            ) {
                for (dk.via.nbnp.databaseserver.domain.Item item : daoResponse) {
                    responseObserver.onNext(ItemMapper.mapDomainToProto(item));
                }
                responseObserver.onCompleted();
            } else {
                List<dk.via.nbnp.databaseserver.domain.Item> items = new ArrayList<>(daoResponse);
                for (dk.via.nbnp.databaseserver.domain.Item item : daoResponse) {
                    if (item.getPrice() > request.getMaxPrice() || item.getPrice() < request.getMinPrice()) {
                        items.remove(item);
                    } else if (!(request.getName().equals("")) && !(item.getName().toLowerCase().contains(request.getName().toLowerCase()))) {
                        items.remove(item);
                    } else if (!(request.getDescription().equals("")) && !(item.getDescription().toLowerCase().contains(request.getDescription().toLowerCase()))) {
                        items.remove(item);
                    } else if (request.getStatus() != item.getStatus()) {
                        items.remove(item);
                    } else if (!(request.getCategory().equals("")) && !(item.getCategory().equals(new dk.via.nbnp.databaseserver.domain.Category(request.getCategory())))) {
                        items.remove(item);
                    } else if (request.getOwnerId() != item.getOwner().getId() && request.getOwnerId() != 0) {
                        items.remove(item);
                    }
                }
                for (dk.via.nbnp.databaseserver.domain.Item item : items
                ) {
                    responseObserver.onNext(ItemMapper.mapDomainToProto(item));
                }
            }
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // IMPLEMENTED
    @Override
    public void getItemById(SearchItemDTO request, StreamObserver<Item> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.Item> daoResponse = itemRepository.findById(request.getId());
        if (daoResponse.isEmpty()) {
            System.out.println("User with this ownerId was not found");
            responseObserver.onError(new Exception("User with this ownerId was not found"));
        } else {
            responseObserver.onNext(ItemMapper.mapDomainToProto(daoResponse.get()));
            responseObserver.onCompleted();
        }
    }

    @Override
    public void updateItem(UpdateItemDTO request, StreamObserver<Item> responseObserver) {
        super.updateItem(request, responseObserver);
    }

    @Override
    public void deleteItem(SearchItemDTO request, StreamObserver<Item> responseObserver) {
        itemRepository.deleteById(request.getId());
    }


}
