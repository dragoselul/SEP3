package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.application.mappers.ImageMapper;
import dk.via.nbnp.databaseserver.protobuf.*;
import dk.via.nbnp.databaseserver.repositories.ImageRepository;
import dk.via.nbnp.databaseserver.repositories.ItemRepository;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@GRpcService
public class ImageService extends ImageServiceGrpc.ImageServiceImplBase{
    private final ItemRepository itemRepository;
    private final ImageRepository imageRepository;

    @Autowired
    public ImageService(ItemRepository itemRepository, ImageRepository imageRepository) {
        this.itemRepository = itemRepository;
        this.imageRepository = imageRepository;
    }

    @Override
    public void uploadImage(UploadImageDto request, StreamObserver<Image> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.Item> item = itemRepository.findById(request.getItemId());
        if(item.isEmpty()) {
            throw new RuntimeException("There is no item with this ID!");
        }
        dk.via.nbnp.databaseserver.domain.Image image = ImageMapper.mapUploadToDomain(request, item.get());
        imageRepository.saveAndFlush(image);
        responseObserver.onNext(ImageMapper.mapDomainToProto(image));
        responseObserver.onCompleted();
    }

    @Override
    public void getImageByItemId(SearchImageDto request, StreamObserver<Image> responseObserver) {
        List<dk.via.nbnp.databaseserver.domain.Image> images = imageRepository.getImagesByItemId(request.getItemId());
        for (dk.via.nbnp.databaseserver.domain.Image image : images) {
            Image img = ImageMapper.mapDomainToProto(image);
            responseObserver.onNext(img);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getImageById(SearchImageDto request, StreamObserver<Image> responseObserver) {
       Optional<dk.via.nbnp.databaseserver.domain.Image> image = imageRepository.findById(request.getId());
        if (image.isEmpty()) {
            System.out.println("Image with this id was not found");
            responseObserver.onError(new Exception("Image with this id was not found"));
        } else {
            responseObserver.onNext(ImageMapper.mapDomainToProto(image.get()));
            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteImageById(SearchImageDto request, StreamObserver<Image> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.Image> image = imageRepository.findById(request.getId());
        if (image.isEmpty()) {
            System.out.println("Image with this id was not found");
            responseObserver.onError(new Exception("Image with this id was not found"));
        } else {
            imageRepository.deleteById(request.getId());
            responseObserver.onNext(ImageMapper.mapDomainToProto(image.get()));
            responseObserver.onCompleted();
        }
    }
}
