package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.repositories.CategoryRepository;
import dk.via.nbnp.databaseserver.repositories.ItemRepository;
import dk.via.nbnp.databaseserver.repositories.UserRepository;
import dk.via.nbnp.databaseserver.application.mappers.ItemMapper;
import dk.via.nbnp.databaseserver.protobuf.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

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
    public ItemService(ItemRepository itemRepository, UserRepository userRepository, CategoryRepository categoryRepository){
        this.itemRepository = itemRepository;
        this.userRepository = userRepository;
        this.categoryRepository = categoryRepository;
    }

    // IMPLEMENTED
    @Override
    public void createItem(CreateItemDTO request, StreamObserver<Item> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.Category> categoryResponse = categoryRepository.findById(request.getCategory());
        Optional<dk.via.nbnp.databaseserver.domain.User> daoResponse = userRepository.findById(request.getOwnerId());
        if(daoResponse.isEmpty()){
            System.out.println("User with this ownerId was not found");
            responseObserver.onError(new Exception("User with this ownerId was not found"));
        }else if(categoryResponse.isEmpty()){
            System.out.println("There is no such category as \""+ request.getCategory() + "\"");
            responseObserver.onError(new Exception("There is no such category as \""+ request.getCategory() + "\""));
        }else{
            dk.via.nbnp.databaseserver.domain.Item item = ItemMapper.mapCreateDtoToDomain(request, daoResponse.get(), categoryResponse.get());
            item = itemRepository.save(item);
            responseObserver.onNext(ItemMapper.mapDomainToProto(item));
            responseObserver.onCompleted();
        }

    }


    // TODO TO BE TESTED
    @Override
    public void getItems(SearchItemDTO request, StreamObserver<Item> responseObserver) {
        List<dk.via.nbnp.databaseserver.domain.Item> daoResponse = itemRepository.findAll();
        if(request.getId() == 0
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
        }
        else {
            for (dk.via.nbnp.databaseserver.domain.Item item : daoResponse) {
                if (request.getName().equals("") || !item.getName().contains(request.getName()))
                    continue;
                if (request.getDescription().equals("") || !item.getDescription().contains(request.getDescription()))
                    continue;
                if (request.getMaxPrice() == 0.0 || item.getPrice() > request.getMaxPrice())
                    continue;
                if (request.getMinPrice() < item.getPrice())
                    continue;
                if (request.getStatus() != item.getStatus())
                    continue;
                if (request.getCategory().equals("") || !item.getCategory().equals(new dk.via.nbnp.databaseserver.domain.Category(request.getCategory())))
                    continue;
                responseObserver.onNext(ItemMapper.mapDomainToProto(item));
            }
        }
        responseObserver.onCompleted();

    }

    // IMPLEMENTED
    @Override
    public void getItemById(SearchItemDTO request, StreamObserver<Item> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.Item> daoResponse = itemRepository.findById(request.getId());
        if(daoResponse.isEmpty()){
            System.out.println("User with this ownerId was not found");
            responseObserver.onError(new Exception("User with this ownerId was not found"));
        }else{
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
