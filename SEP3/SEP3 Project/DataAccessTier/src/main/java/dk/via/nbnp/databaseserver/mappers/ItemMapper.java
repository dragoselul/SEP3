package dk.via.nbnp.databaseserver.mappers;

import dk.via.nbnp.databaseserver.domain.User;
import dk.via.nbnp.databaseserver.protobuf.CreateItemDTO;
import dk.via.nbnp.databaseserver.protobuf.Item;

public class ItemMapper {

    public static Item mapDomainToProto(dk.via.nbnp.databaseserver.domain.Item item){
        return Item.newBuilder()
                .setId(item.getId())
                .setOwner(UserMapper.mapDomainToProto(item.getOwner()))
                .setName(item.getName())
                .setDescription(item.getDescription())
                .setPrice(item.getPrice())
                .setCurrency(item.getCurrency())
                .setDateOfAdding(LocalDateMapper.mapDomainToProto(item.getDateOfAdding()))
                .setCategory(item.getCategory())
                .setStatus(item.getStatus())
                .build();
    }

    public static dk.via.nbnp.databaseserver.domain.Item mapCreateDtoToDomain(CreateItemDTO item, User owner){
        return new dk.via.nbnp.databaseserver.domain.Item(
                item.getName(),
                item.getDescription(),
                item.getPrice(),
                item.getCurrency(),
                item.getCategory(),
                item.getStatus(),
                owner
        );
    }

}
