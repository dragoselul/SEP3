package via.sdj3.slaughterhouse.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import via.sdj3.slaughterhouse.Model.Animal;
import via.sdj3.slaughterhouse.Model.AnimalPart;
import via.sdj3.slaughterhouse.Repositories.AnimalRepository;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AnimalConfig {
    @Bean
    CommandLineRunner commandLineRunner(AnimalRepository animalRepository) {
        return args -> {
        //    Animal cow = new Animal("Cow",200.45, new ArrayList<>(List.of(new AnimalPart())))
        };
    }
}
