package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.application.DAOInterfaces.ProductRepository;
import dk.via.nbnp.databaseserver.application.serviceInterfaces.IProductService;
import dk.via.nbnp.databaseserver.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    private final ProductRepository productRepository;

    @Autowired
    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts(){
       return productRepository.findAll();
    }

    @Override
    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) throws Exception{
        Optional<Product> opt = productRepository.findById(id);
        if(opt.isEmpty())
            throw new Exception("No product with id " + id.toString() + " was found");
        return opt.get();
    }
    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
