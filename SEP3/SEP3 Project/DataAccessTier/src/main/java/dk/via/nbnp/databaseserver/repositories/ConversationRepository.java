package dk.via.nbnp.databaseserver.repositories;

import dk.via.nbnp.databaseserver.domain.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConversationRepository extends JpaRepository<Conversation, Long> {

    List<Conversation> findAllBySellerIdOrBuyerId(Long sellerId, Long buyerId);

}
