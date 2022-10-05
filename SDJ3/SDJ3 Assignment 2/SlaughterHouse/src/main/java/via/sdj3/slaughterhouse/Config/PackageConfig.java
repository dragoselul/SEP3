package via.sdj3.slaughterhouse.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import via.sdj3.slaughterhouse.Repositories.TrayRepository;

@Configuration
public class PackageConfig {
    @Bean
    CommandLineRunner commandLineRunner(TrayRepository trayRepository) {
        return args -> {
        };
    }
}
