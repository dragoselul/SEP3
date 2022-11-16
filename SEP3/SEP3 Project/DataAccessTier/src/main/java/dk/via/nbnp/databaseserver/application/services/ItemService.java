package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.application.DAOInterfaces.ItemRepository;

import dk.via.nbnp.databaseserver.protobuf.CreateItemDTO;
import dk.via.nbnp.databaseserver.protobuf.Item;
import dk.via.nbnp.databaseserver.protobuf.ItemServiceGrpc;
import dk.via.nbnp.databaseserver.protobuf.SearchItemDTO;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@GRpcService
public class ItemService extends ItemServiceGrpc.ItemServiceImplBase {

    @Autowired
    private final ItemRepository ItemRepository;

    @Autowired
    public ItemService(ItemRepository ItemRepository){
        this.ItemRepository = ItemRepository;
    }
    @Override
    public void createItem(CreateItemDTO request, StreamObserver<Item> responseObserver) {

        dk.via.nbnp.databaseserver.domain.Item item = new dk.via.nbnp.databaseserver.domain.Item(
                request.getName(),
                request.getDescription(),
                request.getPrice(),
                request.getCurrency(),
                request.getCategory(),
                Boolean.parseBoolean(request.getStatus())
        );

        ItemRepository.save(item);
        Item newItem = Item.newBuilder()
                .setId(item.getId())
                .setName(item.getName())
                .setDescription(item.getDescription())
                .setPrice(item.getPrice())
                .setCurrency(item.getCurrency())
                .setDateOfAdding(Item.LocalDateTime.newBuilder()
                        .setDay(item.getDateOfAdding().getDayOfMonth())
                        .setMonth(item.getDateOfAdding().getMonthValue())
                        .setYear(item.getDateOfAdding().getYear())
                        .setHour(item.getDateOfAdding().getHour())
                        .setMinute(item.getDateOfAdding().getMinute())
                        .build())
                .setCategory(item.getCategory())
                .setStatus(item.getStatus()).build();

        responseObserver.onNext(newItem);
        responseObserver.onCompleted();

    }
    @Override
    public void getItem(SearchItemDTO request, StreamObserver<Item> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.Item> daoResponse = ItemRepository.findById(request.getId());

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
                    .setDateOfAdding(Item.LocalDateTime.newBuilder()
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

    @Override
    public void updateItem(CreateItemDTO request, StreamObserver<Item> responseObserver) {
        super.updateItem(request, responseObserver);
    }

    @Override
    public void deleteItem(SearchItemDTO request, StreamObserver<Item> responseObserver) {
        super.deleteItem(request, responseObserver);
    }
}
