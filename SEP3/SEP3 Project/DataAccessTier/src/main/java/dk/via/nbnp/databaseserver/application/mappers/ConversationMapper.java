package dk.via.nbnp.databaseserver.application.mappers;

import dk.via.nbnp.databaseserver.protobuf.Conversation;
import dk.via.nbnp.databaseserver.protobuf.Message;

public abstract class ConversationMapper {

    public static Conversation mapDomainToProto(dk.via.nbnp.databaseserver.domain.Conversation conversation){
        Conversation.Builder builder = Conversation.newBuilder();
        for (int i = 0; i < conversation.getMessageList().size(); i++) {
            builder.setMessages(i, MessageMapper.mapDomainToProto(conversation.getMessageList().get(i)));
        }
        return builder.
            setBuyer(UserMapper.mapDomainToProto(conversation.getBuyer())).
            setSeller(UserMapper.mapDomainToProto(conversation.getSeller())).
            setItem(ItemMapper.mapDomainToProto(conversation.getItem())).
            setDateOfStart(LocalDateMapper.mapDomainToProto(conversation.getDateTimeOfStart())).
            build();
    }

}
