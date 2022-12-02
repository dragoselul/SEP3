package dk.via.nbnp.databaseserver.application.mappers;

import com.google.protobuf.ByteString;
import dk.via.nbnp.databaseserver.domain.Item;
import dk.via.nbnp.databaseserver.protobuf.Image;
import dk.via.nbnp.databaseserver.protobuf.UploadImageDto;

public abstract class ImageMapper {
    public static Image mapDomainToProto (dk.via.nbnp.databaseserver.domain.Image image) {
        return Image.newBuilder()
                .setId(image.getId())
                .setImage(ByteString.copyFrom(image.getImage(), 0, image.getImage().length))
                .setItemId(image.getId())
                .build();
    }

    public static dk.via.nbnp.databaseserver.domain.Image mapUploadToDomain(UploadImageDto imageDto, Item item) {
        return new dk.via.nbnp.databaseserver.domain.Image(imageDto.toByteArray(), item);
    }
}
