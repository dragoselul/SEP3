package dk.via.nbnp.databaseserver.repositories;

import dk.via.nbnp.databaseserver.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
