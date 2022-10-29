package via.sdj3.slaughterhouse.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import via.sdj3.slaughterhouse.Model.Package;

public interface PackageRepository extends JpaRepository<Package, Integer> {
}
