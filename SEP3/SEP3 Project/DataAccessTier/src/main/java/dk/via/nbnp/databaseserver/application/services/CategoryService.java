package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.repositories.CategoryRepository;
import dk.via.nbnp.databaseserver.application.mappers.CategoryMapper;
import dk.via.nbnp.databaseserver.protobuf.Category;
import dk.via.nbnp.databaseserver.protobuf.CategoryServiceGrpc;
import dk.via.nbnp.databaseserver.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GRpcService
public class CategoryService extends CategoryServiceGrpc.CategoryServiceImplBase {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void getCategories(Empty request, StreamObserver<Category> responseObserver) {
        List<dk.via.nbnp.databaseserver.domain.Category> categories = categoryRepository.findAll();
        for (dk.via.nbnp.databaseserver.domain.Category category : categories) {
            responseObserver.onNext(CategoryMapper.fromDomainToProto(category));
        }
        responseObserver.onCompleted();
    }
}
