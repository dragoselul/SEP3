package via.sdj3.slaughterhouse.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import via.sdj3.slaughterhouse.Repositories.AnimalRepository;

@Configuration
public class ReturnPackageConfig
{
    @Bean
    CommandLineRunner commandLineRunner(AnimalRepository animalRepository) {
        return args -> {

        };
    }
}
