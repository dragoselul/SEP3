package dk.via.nbnp.databaseserver.application.config;

import dk.via.nbnp.databaseserver.daos.ItemRepository;
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
            Item item = new Item(
                   "IPhone 8 Pro",
                    "Functioning Iphone 8 Pro, used for 4 years",
                    500.0,
                    "DKK",
                    null,
                    false,
                    null
            );

            Item item2 = new Item(
                    "IPhone 11 Pro",
                    "Functioning Iphone 11 Pro, used for half a year",
                    1500.0,
                    "DKK",
                    null,
                    false,
                    null
            );

            repository.saveAll(List.of(item, item2));

        };
    }

}
