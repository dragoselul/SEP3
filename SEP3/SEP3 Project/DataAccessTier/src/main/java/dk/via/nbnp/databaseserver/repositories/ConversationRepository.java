package dk.via.nbnp.databaseserver.repositories;

import dk.via.nbnp.databaseserver.domain.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationRepository extends JpaRepository<Conversation, Long> { }
