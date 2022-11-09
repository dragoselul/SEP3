package dk.via.nbnp.databaseserver.config;

import dk.via.nbnp.databaseserver.application.DAOInterfaces.ProductRepository;
import dk.via.nbnp.databaseserver.domain.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner productCommandLineRunner(ProductRepository repository){
        return args -> {
            Product product = new Product(
                    "IPhone 8 Pro",
                    "Functioning Iphone 8 Pro, used for 4 years",
                    500.0,
                    "DKK",
                    "Electronics",
                    "Available"
            );

            Product product2 = new Product(
                    "IPhone 11 Pro",
                    "Functioning Iphone 11 Pro, used for half a year",
                    1500.0,
                    "DKK",
                    "Electronics",
                    "Available"
            );

            repository.saveAll(List.of(product, product2));

        };
    }

}
