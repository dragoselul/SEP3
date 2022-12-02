package dk.via.nbnp.databaseserver.repositories;

import dk.via.nbnp.databaseserver.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> getImagesByItemId(long id);
}
