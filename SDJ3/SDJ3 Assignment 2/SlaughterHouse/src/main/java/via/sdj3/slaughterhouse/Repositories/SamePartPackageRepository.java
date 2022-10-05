package via.sdj3.slaughterhouse.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import via.sdj3.slaughterhouse.Model.ReturnPackage;
import via.sdj3.slaughterhouse.Model.SamePartPackage;

public interface SamePartPackageRepository extends JpaRepository<SamePartPackage,Integer> {
}
