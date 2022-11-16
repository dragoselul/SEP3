package dk.via.nbnp.databaseserver.application.DAOInterfaces;

import dk.via.nbnp.databaseserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
