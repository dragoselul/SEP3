package dk.via.nbnp.databaseserver.controllers;

import dk.via.nbnp.databaseserver.application.serviceInterfaces.IProductService;
import dk.via.nbnp.databaseserver.domain.Product;
import dk.via.nbnp.databaseserver.application.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/product")
public class ProductController {

    private final IProductService productService;

    @Autowired
    public ProductController(IProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

}
