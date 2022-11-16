package dk.via.nbnp.databaseserver.application.serviceInterfaces;

import dk.via.nbnp.databaseserver.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IUserService {

    List<User> getUsers();
    User createUser(User product);
    User getUserById(Long id) throws Exception;
    void deleteById(Long id);
}
