package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.application.DAOInterfaces.ProductRepository;
import dk.via.nbnp.databaseserver.application.serviceInterfaces.IProductService;
import dk.via.nbnp.databaseserver.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private final ProductRepository productRepository;

    @Autowired
    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
       return productRepository.findAll();
    }

}
