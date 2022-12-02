package dk.via.nbnp.databaseserver.application.config;

import dk.via.nbnp.databaseserver.repositories.CategoryRepository;
import dk.via.nbnp.databaseserver.domain.Category;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CategoryConfig {
    @Bean
    CommandLineRunner categoryCommandLineRunner(CategoryRepository repository) {
        return args -> {
            repository.saveAll(List.of(
                new Category("Vehicles"),
                new Category("Electronics"),
                new Category("Clothes"),
                new Category("Garden"),
                new Category("Furniture"))
            );
        };
    }
}
