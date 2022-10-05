package via.sdj3.slaughterhouse.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import via.sdj3.slaughterhouse.Model.Animal;
import via.sdj3.slaughterhouse.Model.AnimalPart;

public interface AnimalPartRepository extends JpaRepository<AnimalPart,Integer> {
}
