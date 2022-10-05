package via.sdj3.slaughterhouse.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import via.sdj3.slaughterhouse.Model.Animal;

public interface AnimalRepository extends JpaRepository<Animal,Integer> {
}
