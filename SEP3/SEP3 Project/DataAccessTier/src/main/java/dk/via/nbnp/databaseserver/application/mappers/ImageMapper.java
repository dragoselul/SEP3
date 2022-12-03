package dk.via.nbnp.databaseserver.application.mappers;
import dk.via.nbnp.databaseserver.domain.Item;
import dk.via.nbnp.databaseserver.protobuf.Image;
import dk.via.nbnp.databaseserver.protobuf.UploadImageDto;

public abstract class ImageMapper {
    public static Image mapDomainToProto (dk.via.nbnp.databaseserver.domain.Image image) {
        return Image.newBuilder()
                .setId(image.getId())
                .setBase64Data(image.getBase64data())
                .setContentType(image.getContentType())
                .setFileName(image.getFileName())
                .setItemId(image.getItem().getId())
                .build();
    }

    public static dk.via.nbnp.databaseserver.domain.Image mapUploadToDomain(UploadImageDto imageDto, Item item) {
        return new dk.via.nbnp.databaseserver.domain.Image(imageDto.getBase64Data(), imageDto.getContentType(), imageDto.getFileName(), item);
    }
}
