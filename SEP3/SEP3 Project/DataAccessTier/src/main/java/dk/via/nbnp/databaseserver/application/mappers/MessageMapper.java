package dk.via.nbnp.databaseserver.application.mappers;

import dk.via.nbnp.databaseserver.protobuf.Message;

public abstract class MessageMapper {

    public static Message mapDomainToProto(dk.via.nbnp.databaseserver.domain.Message message){
        return Message.newBuilder().
                setId(message.getId()).
                setConversationId(message.getConversation().getId()).
                setMessage(message.getContent()).
                setSender(UserMapper.mapDomainToProto(message.getSender())).
                build();
    }

}