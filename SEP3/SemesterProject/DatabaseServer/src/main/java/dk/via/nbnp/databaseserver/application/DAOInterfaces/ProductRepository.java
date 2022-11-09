package dk.via.nbnp.databaseserver.application.DAOInterfaces;

import dk.via.nbnp.databaseserver.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
