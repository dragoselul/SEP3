package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.application.mappers.MessageMapper;
import dk.via.nbnp.databaseserver.domain.User;
import dk.via.nbnp.databaseserver.protobuf.*;
import dk.via.nbnp.databaseserver.repositories.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@GRpcService
public class MessageService extends MessageServiceGrpc.MessageServiceImplBase {

    private final MessageRepository messageRepository;
    private final UserRepository userRepository;
    private final ConversationRepository conversationRepository;
    private final NotificationRepository notificationRepository;

    @Autowired
    public MessageService(ConversationRepository conversationRepository, MessageRepository messageRepository,
              UserRepository userRepository, NotificationRepository notificationRepository) {
        this.conversationRepository = conversationRepository;
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
        this.notificationRepository = notificationRepository;
    }

    public void createNotification(dk.via.nbnp.databaseserver.domain.Message message){

        dk.via.nbnp.databaseserver.domain.Conversation conv = message.getConversation();
        long ownerId = (Objects.equals(conv.getBuyer().getId(), message.getSender().getId())) ? conv.getSeller().getId() : conv.getBuyer().getId();

        Optional<User> owner = userRepository.findById(ownerId);
        if(owner.isEmpty()){
            throw new EntityNotFoundException("User with this Id does not exist");
        }else{
            dk.via.nbnp.databaseserver.domain.Notification notification = new dk.via.nbnp.databaseserver.domain.Notification(
                    "Message from " + message.getSender().getFirstName() + " " + message.getSender().getLastName(),
                    message.getContent(),
                    owner.get(),
                    "message",
                    message.getConversation().getId()
            );
            notificationRepository.save(notification);
        }

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
                createNotification(generated);

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
