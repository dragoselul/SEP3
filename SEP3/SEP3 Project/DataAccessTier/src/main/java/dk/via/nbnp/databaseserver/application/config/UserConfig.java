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
//            User user1 = new User(
//                  "Chiril",
//                  "Luncasu",
//                  "chiril.luncasu@gmail.com",
//                  "5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8",
//                  "+4512993933",
//                  true
//            );
//
//            User user2 = new User(
//                    "Dan-Sebastian",
//                    "Ceapa",
//                    "danceapa@gmail.com",
//                    "539ae660a6865a491fe97e8b00d807a9777ba33b6c3852ccaf1f3d670f480f70",
//                    "+4533238929",
//                    true
//            );
//            repository.saveAll(List.of(user1, user2));
        };
    }
}
