package via.sdj3.slaughterhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import via.sdj3.slaughterhouse.Interface.SlaughterHouse;
import via.sdj3.slaughterhouse.Model.RemoteSlaughterHouse;
import via.sdj3.slaughterhouse.Repositories.AnimalRepository;
import via.sdj3.slaughterhouse.Services.AnimalService;

import java.net.URISyntaxException;

@SpringBootApplication
public class SlaughterHouseApplication {
    public static void main(String[] args) {
        SpringApplication.run(SlaughterHouseApplication.class, args);
    }

}
