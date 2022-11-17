package dk.via.nbnp.databaseserver.application.mappers;

import dk.via.nbnp.databaseserver.protobuf.Category;

public abstract class CategoryMapper {

    public static Category fromDomainToProto(dk.via.nbnp.databaseserver.domain.Category category){
        return Category.newBuilder().setName(category.getName()).build();
    }

}
