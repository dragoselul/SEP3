package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.application.DAOInterfaces.ItemRepository;
import dk.via.nbnp.databaseserver.protobuf.CreateProductDTO;
import dk.via.nbnp.databaseserver.protobuf.Product;
import dk.via.nbnp.databaseserver.protobuf.ProductServiceGrpc;
import dk.via.nbnp.databaseserver.protobuf.SearchProductDTO;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@GRpcService
public class ProductService extends ProductServiceGrpc.ProductServiceImplBase {

    @Autowired
    private final ItemRepository productRepository;

    @Autowired
    public ProductService(ItemRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public void createProduct(CreateProductDTO request, StreamObserver<Product> responseObserver) {

//        dk.via.nbnp.databaseserver.domain.Product product = new dk.via.nbnp.databaseserver.domain.Product(
//                request.getName(),
//                request.getDescription(),
//                request.getPrice(),
//                request.getCurrency(),
//                request.getCategory(),
//                request.getStatus());
//
//        product = productRepository.save(product);
//
////        Product newProduct = Product.newBuilder()
////                .setId(product.getId())
////                .set
//
//        responseObserver.onNext();

    }
    @Override
    public void getProduct(SearchProductDTO request, StreamObserver<Product> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.Product> daoResponse = productRepository.findById(request.getId());

        if(daoResponse.isEmpty()){
            System.out.println("Product with this ID was not found");
        }else{
            dk.via.nbnp.databaseserver.domain.Product product = daoResponse.get();

            Product.LocalDateTime dateTime =
                    Product.LocalDateTime.newBuilder()
                            .setDay(product.getDateOfAdding().getDayOfMonth())
                            .setMonth(product.getDateOfAdding().getMonthValue())
                            .setYear(product.getDateOfAdding().getYear())
                            .setHour(product.getDateOfAdding().getHour())
                            .setMinute(product.getDateOfAdding().getMinute()).build();

            Product toSend = Product.newBuilder()
                    .setId(product.getId())
                    .setName(product.getName())
                    .setDescription(product.getDescription())
                    .setPrice(product.getPrice())
                    .setCurrency(product.getCurrency())
                    .setDateOfAdding(dateTime)
                    .setCategory(product.getCategory())
                    .setStatus(product.getStatus()).build();

            responseObserver.onNext(toSend);
            responseObserver.onCompleted();

        }


    }


    //    @Override
//    public List<Product> getProducts(){
//       return productRepository.findAll();
//    }
//
//    @Override
//    public Product createProduct(Product product){
//        return productRepository.save(product);
//    }
//
//    @Override
//    public Product getProductById(Long id) throws Exception{
//        Optional<Product> opt = productRepository.findById(id);
//        if(opt.isEmpty())
//            throw new Exception("No product with id " + id.toString() + " was found");
//        return opt.get();
//    }
//    @Override
//    public void deleteById(Long id) {
//        productRepository.deleteById(id);
//    }
}
