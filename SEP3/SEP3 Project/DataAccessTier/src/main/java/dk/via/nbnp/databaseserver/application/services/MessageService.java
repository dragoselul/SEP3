package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.application.mappers.MessageMapper;
import dk.via.nbnp.databaseserver.domain.User;
import dk.via.nbnp.databaseserver.protobuf.*;
import dk.via.nbnp.databaseserver.repositories.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@GRpcService
public class MessageService extends MessageServiceGrpc.MessageServiceImplBase {

    private final MessageRepository messageRepository;
    private final UserRepository userRepository;
    private final ConversationRepository conversationRepository;

    @Autowired
    public MessageService(ConversationRepository conversationRepository, MessageRepository messageRepository, UserRepository userRepository) {
        this.conversationRepository = conversationRepository;
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void getMessageById(SearchMessageDTO request, StreamObserver<Message> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.Message> responseDao = messageRepository.findById(request.getId());
        if(responseDao.isEmpty()){
            System.out.println("No message with this id {"+request.getId()+"} was found.");
            responseObserver.onError(new Exception("No message with this id {"+request.getId()+"} was found."));
        }else{
            responseObserver.onNext(MessageMapper.mapDomainToProto(responseDao.get()));
            responseObserver.onCompleted();
        }
    }

    // TODO FINISH
    @Override
    public void getMessagesByConversationId(SearchMessageDTO request, StreamObserver<Message> responseObserver) {
        List<dk.via.nbnp.databaseserver.domain.Message> responseDao = messageRepository.findAllByConversationIdOrderByDateTimeSentAsc(request.getId());
        for (dk.via.nbnp.databaseserver.domain.Message message : responseDao) {
            responseObserver.onNext(MessageMapper.mapDomainToProto(message));
        }
        responseObserver.onCompleted();

    }

    @Override
    public void createMessage(CreateMessageDTO request, StreamObserver<Message> responseObserver) {
        Optional<User> user = userRepository.findById(request.getSenderId());
        if(user.isEmpty()){
            System.out.println("Sender with this id {"+request.getSenderId()+"} was not found.");
            responseObserver.onError(new Exception("Sender with this id {"+request.getSenderId()+"} was not found."));
        }else{
            Optional<dk.via.nbnp.databaseserver.domain.Conversation> conv = conversationRepository.findById(request.getConversationId());
            if(conv.isEmpty()){
                System.out.println("Conversation with this id {"+request.getSenderId()+"} was not found.");
                responseObserver.onError(new Exception("Conversation with this id {"+request.getSenderId()+"} was not found."));
            }else{
                dk.via.nbnp.databaseserver.domain.Message message = new dk.via.nbnp.databaseserver.domain.Message(
                        request.getContent(),
                        user.get(),
                        conv.get()
                );
                dk.via.nbnp.databaseserver.domain.Message generated = messageRepository.save(message);
                responseObserver.onNext(MessageMapper.mapDomainToProto(generated));
                responseObserver.onCompleted();
            }
        }
    }

    @Override
    public void deleteMessageById(SearchMessageDTO request, StreamObserver<Message> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.Message> message = messageRepository.findById(request.getId());
        responseObserver.onNext(MessageMapper.mapDomainToProto(message.get()));
        messageRepository.deleteById(request.getId());
        responseObserver.onCompleted();
    }
}
