package dk.via.nbnp.databaseserver.application.serviceInterfaces;

import dk.via.nbnp.databaseserver.domain.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IProductService {

    List<Product> getProducts();
    Product createProduct(Product product);
    Product getProductById(Long id) throws Exception;
}
