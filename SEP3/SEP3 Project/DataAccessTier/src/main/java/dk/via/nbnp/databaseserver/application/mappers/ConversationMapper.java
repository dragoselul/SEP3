package dk.via.nbnp.databaseserver.application.mappers;

import dk.via.nbnp.databaseserver.protobuf.Conversation;
import dk.via.nbnp.databaseserver.protobuf.Message;

import java.util.ArrayList;

public abstract class ConversationMapper {

    public static Conversation mapDomainToProto(dk.via.nbnp.databaseserver.domain.Conversation conversation){
        Conversation.Builder builder = Conversation.newBuilder();
        ArrayList<Message> messages = new ArrayList<>();
        for (dk.via.nbnp.databaseserver.domain.Message message : conversation.getMessageList()) {
            messages.add(MessageMapper.mapDomainToProto(message));
        }
        builder.addAllMessages(messages);
        return builder.setId(conversation.getId()).
            setBuyer(UserMapper.mapDomainToProto(conversation.getBuyer())).
            setSeller(UserMapper.mapDomainToProto(conversation.getSeller())).
            setItem(ItemMapper.mapDomainToProto(conversation.getItem())).
            setDateOfStart(LocalDateMapper.mapDomainToProto(conversation.getDateTimeOfStart())).
            build();
    }

}
