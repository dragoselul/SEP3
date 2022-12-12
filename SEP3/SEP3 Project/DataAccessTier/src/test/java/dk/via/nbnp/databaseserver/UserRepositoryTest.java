package dk.via.nbnp.databaseserver;
import dk.via.nbnp.databaseserver.domain.User;
import dk.via.nbnp.databaseserver.repositories.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
@DataJpaTest
@EnableAutoConfiguration
@ActiveProfiles
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    // JUnit test for saving a user
    @Test
    @Rollback(value = false)
    public void saveUserTest(){

        User user = new User ("Johan" , "Straus", "johan@gmail.com", "qwerty123", "45757686", false);
        //Mockito.when(userRepository.save(user)).thenReturn(user);
        user = userRepository.save(user);
        //Assertions.assertThat(user.getId()).isGreaterThan(0);
        Assertions.assertThat(user.getId()).isGreaterThan(0);
    }

    @Test
    @Rollback(value = false)
    public void getUserTest(){

        User user = userRepository.findById(1L).get();

        Assertions.assertThat(user.getId()).isEqualTo(1L);
    }

    @Test
    @Rollback(value = false)
    public void getListOfUsersTest(){
       List<User> users = userRepository.findAll();

       Assertions.assertThat(users.size()).isGreaterThan(0);
    }

    @Test
    @Rollback(value = false)
    public void updateUserTest(){
        User user = userRepository.findById(1L).get();

        user.setEmail("johanstraus@gmail.com");

        User userUpdated = userRepository.save(user);

        Assertions.assertThat(userUpdated.getEmail()).isEqualTo("johanstraus@gmail.com");
    }

    @Test
    @Rollback(value = false)
    public void deleteUserTest(){
        User user = userRepository.findById(1L).get();

        userRepository.delete(user);

        User user1 = null;

        Optional<User> optionalUser = userRepository.findByEmailAndPassword("johanstraus@gmail.com", "qwerty123");

        if(optionalUser.isPresent()){
            user1 = optionalUser.get();
        }

        Assertions.assertThat(user1).isNull();
    }
}
