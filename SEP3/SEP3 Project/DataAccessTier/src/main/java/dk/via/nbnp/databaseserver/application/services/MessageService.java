package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.application.mappers.MessageMapper;
import dk.via.nbnp.databaseserver.domain.User;
import dk.via.nbnp.databaseserver.protobuf.*;
import dk.via.nbnp.databaseserver.repositories.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.util.Optional;

@GRpcService
public class MessageService extends MessageServiceGrpc.MessageServiceImplBase {

    @Autowired
    private MessageRepository messageRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ConversationRepository conversationRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository, UserRepository userRepository, ConversationRepository conversationRepository) {
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
        this.conversationRepository = conversationRepository;
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
        Optional<dk.via.nbnp.databaseserver.domain.Message> responseDao = messageRepository.findById(request.getId());
        if(responseDao.isEmpty()){
            System.out.println("No message with this id {"+request.getId()+"} was found.");
            responseObserver.onError(new Exception("No message with this id {"+request.getId()+"} was found."));
        }else{
            responseObserver.onNext(MessageMapper.mapDomainToProto(responseDao.get()));
            responseObserver.onCompleted();
        }
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
                messageRepository.save(message);
            }
        }
    }
}
