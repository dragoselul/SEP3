package dk.via.nbnp.databaseserver.repositories;

import dk.via.nbnp.databaseserver.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    List<Message> findAllByConversationIdOrderByDateTimeSentAsc(Long id);

}
