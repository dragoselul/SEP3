package dk.via.nbnp.databaseserver.repositories;

import dk.via.nbnp.databaseserver.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {

}
