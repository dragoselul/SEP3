package via.sdj3.slaughterhouse.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import via.sdj3.slaughterhouse.Model.Animal;
import via.sdj3.slaughterhouse.Model.ReturnPackage;

public interface ReturnPackageRepository extends JpaRepository<ReturnPackage,Integer> {
}
