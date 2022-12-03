package dk.via.nbnp.databaseserver.repositories;

import dk.via.nbnp.databaseserver.domain.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findAllByOwnerId(Long id);
    @Transactional
    void deleteAllByOwnerId(Long id);
}
