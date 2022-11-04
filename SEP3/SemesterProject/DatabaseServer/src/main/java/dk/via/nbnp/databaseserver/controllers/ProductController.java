package dk.via.nbnp.databaseserver.controllers;

import dk.via.nbnp.databaseserver.application.serviceInterfaces.IProductService;
import dk.via.nbnp.databaseserver.domain.Product;
import jdk.jshell.Snippet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private final IProductService productService;

    @Autowired
    public ProductController(IProductService productService){
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        try{
            return new ResponseEntity<>(productService.createProduct(product), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.resolve(500));
        }
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts(){
        try{
            return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.resolve(500));
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        try{
            return new ResponseEntity<>(productService.getProductById(id), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.resolve(500));
        }

    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteById(id);
    }

//    @PutMapping("/product/{id}")
//    public Product updateProduct(@PathVariable Long id){
//        return
//    }



}
