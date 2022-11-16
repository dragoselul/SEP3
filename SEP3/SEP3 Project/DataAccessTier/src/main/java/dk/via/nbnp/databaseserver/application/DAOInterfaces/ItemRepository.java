package dk.via.nbnp.databaseserver.application.DAOInterfaces;

import dk.via.nbnp.databaseserver.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
