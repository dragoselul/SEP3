package dk.via.nbnp.databaseserver.application.config;

import dk.via.nbnp.databaseserver.domain.Category;
import dk.via.nbnp.databaseserver.domain.User;
import dk.via.nbnp.databaseserver.repositories.ItemRepository;
import dk.via.nbnp.databaseserver.domain.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ItemConfig {
    @Bean
    CommandLineRunner itemCommandLineRunner(ItemRepository repository){
        return args -> {

//            User owner = new User(
//                    1,
//                    "Chiril",
//                    "Luncasu",
//                    "chiril.luncasu@gmail.com",
//                    "5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8",
//                    "+4512993933",
//                    true
//            );
//
//            Item item = new Item(
//                   "IPhone 8 Pro",
//                    "Functioning Iphone 8 Pro, used for 4 years",
//                    500.0,
//                    "DKK",
//                    new Category("Electronics"),
//                    false,
//                    null
//            );
//
//            Item item2 = new Item(
//                    "IPhone 11 Pro",
//                    "Functioning Iphone 11 Pro, used for half a year",
//                    1500.0,
//                    "DKK",
//                    new Category("Electronics"),
//                    false,
//            );

            //repository.saveAll(List.of(item, item2));

        };
    }
}
