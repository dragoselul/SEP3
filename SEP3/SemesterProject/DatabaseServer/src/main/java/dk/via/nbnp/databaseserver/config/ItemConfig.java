package dk.via.nbnp.databaseserver.config;

import dk.via.nbnp.databaseserver.application.DAOInterfaces.ItemRepository;
import dk.via.nbnp.databaseserver.domain.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ItemConfig {

    @Bean
<<<<<<< Updated upstream:SEP3/SemesterProject/DatabaseServer/src/main/java/dk/via/nbnp/databaseserver/config/ItemConfig.java
    CommandLineRunner itemCommandLineRunner(ItemRepository repository){
        return args -> {
            Item item = new Item(
=======
    CommandLineRunner productCommandLineRunner(ItemRepository repository){
        return args -> {
            Item product = new Item(
>>>>>>> Stashed changes:SEP3/SEP3 Project/DataAccessTier/src/main/java/dk/via/nbnp/databaseserver/config/ProductConfig.java
                    "IPhone 8 Pro",
                    "Functioning Iphone 8 Pro, used for 4 years",
                    500.0,
                    "DKK",
                    "Electronics",
                    false
            );

<<<<<<< Updated upstream:SEP3/SemesterProject/DatabaseServer/src/main/java/dk/via/nbnp/databaseserver/config/ItemConfig.java
            Item item2 = new Item(
=======
            Item product2 = new Item(
>>>>>>> Stashed changes:SEP3/SEP3 Project/DataAccessTier/src/main/java/dk/via/nbnp/databaseserver/config/ProductConfig.java
                    "IPhone 11 Pro",
                    "Functioning Iphone 11 Pro, used for half a year",
                    1500.0,
                    "DKK",
                    "Electronics",
                    false
            );

            repository.saveAll(List.of(item, item2));

        };
    }

}
