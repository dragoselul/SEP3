package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.application.DAOInterfaces.ItemRepository;
import dk.via.nbnp.databaseserver.application.DAOInterfaces.UserRepository;
import dk.via.nbnp.databaseserver.mappers.ItemMapper;
import dk.via.nbnp.databaseserver.protobuf.*;
import io.grpc.stub.StreamObserver;
import org.checkerframework.checker.nullness.Opt;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@GRpcService
public class ItemService extends ItemServiceGrpc.ItemServiceImplBase {

    @Autowired
    private final ItemRepository itemRepository;
    @Autowired
    private final UserRepository userRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository, UserRepository userRepository){
        this.itemRepository = itemRepository;
        this.userRepository = userRepository;
    }

    // TODO TEST
    @Override
    public void createItem(CreateItemDTO request, StreamObserver<Item> responseObserver) {

        Optional<dk.via.nbnp.databaseserver.domain.User> daoResponse = userRepository.findById(request.getOwnerId());
        if(daoResponse.isEmpty()){
            System.out.println("User with this ownerId was not found");
            responseObserver.onError(new Exception("User with this ownerId was not found"));
        }else{
            dk.via.nbnp.databaseserver.domain.Item item = ItemMapper.mapCreateDtoToDomain(request, daoResponse.get());
            item = itemRepository.save(item);
            responseObserver.onNext(ItemMapper.mapDomainToProto(item));
            responseObserver.onCompleted();
        }

    }


    @Override
    public void getItems(SearchItemDTO request, StreamObserver<Item> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.Item> daoResponse = itemRepository.findById(request.getId());

        if(daoResponse.isEmpty()){
            System.out.println("Item with this ID was not found");
        }else{
            dk.via.nbnp.databaseserver.domain.Item item = daoResponse.get();
            Item toSend = Item.newBuilder()
                    .setId(item.getId())
                    .setName(item.getName())
                    .setDescription(item.getDescription())
                    .setPrice(item.getPrice())
                    .setCurrency(item.getCurrency())
                    .setDateOfAdding(LocalDateTime.newBuilder()
                            .setDay(item.getDateOfAdding().getDayOfMonth())
                            .setMonth(item.getDateOfAdding().getMonthValue())
                            .setYear(item.getDateOfAdding().getYear())
                            .setHour(item.getDateOfAdding().getHour())
                            .setMinute(item.getDateOfAdding().getMinute())
                            .build())
                    .setCategory(item.getCategory())
                    .setStatus(item.getStatus()).build();



            responseObserver.onNext(toSend);
            responseObserver.onCompleted();

        }


    }

    // TODO TEST
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
        super.deleteItem(request, responseObserver);
    }
}
