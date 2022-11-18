package dk.via.nbnp.databaseserver.application.config;

import dk.via.nbnp.databaseserver.repositories.UserRepository;
import dk.via.nbnp.databaseserver.domain.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner userCommandLineRuner(UserRepository repository){
        return args -> {
            User user1 = new User(
                  "Chiril",
                  "Luncasu",
                  "chiril.luncasu@gmail.com",
                  "password",
                  "+4512993933",
                  true
            );

            User user2 = new User(
                    "Dan Sebastian",
                    "Ceapa",
                    "danceapa@gmail.com",
                    "ugandon",
                    "+4533238929",
                    true
            );
            repository.saveAll(List.of(user1, user2));
        };
    }

}
