package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.application.mappers.ConversationMapper;
import dk.via.nbnp.databaseserver.application.mappers.MessageMapper;
import dk.via.nbnp.databaseserver.protobuf.*;
import dk.via.nbnp.databaseserver.repositories.ConversationRepository;
import dk.via.nbnp.databaseserver.repositories.ItemRepository;
import dk.via.nbnp.databaseserver.repositories.UserRepository;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@GRpcService
public class ConversationService extends ConversationServiceGrpc.ConversationServiceImplBase {

    private final ItemRepository itemRepository;
    private final UserRepository userRepository;
    private final ConversationRepository conversationRepository;

    @Autowired
    public ConversationService(ItemRepository itemRepository, UserRepository userRepository, ConversationRepository conversationRepository) {
        this.itemRepository = itemRepository;
        this.userRepository = userRepository;
        this.conversationRepository = conversationRepository;
    }

    @Override
    public void createConversation(CreateConversationDTO request, StreamObserver<Conversation> responseObserver) {

        Optional<dk.via.nbnp.databaseserver.domain.User> seller = userRepository.findById(request.getSellerId());
        Optional<dk.via.nbnp.databaseserver.domain.User> buyer = userRepository.findById(request.getBuyerId());
        Optional<dk.via.nbnp.databaseserver.domain.Item> item = itemRepository.findById(request.getItemId());

        if(seller.isEmpty() || buyer.isEmpty()){
            System.out.println("User with this Id was not found");
            responseObserver.onError(new Exception("User with this Id was not found"));
        }else if(item.isEmpty()){
            System.out.println("Item with this id was not found");
            responseObserver.onError(new Exception("Item with this id was not found"));
        }else{
            dk.via.nbnp.databaseserver.domain.Conversation conversation = new dk.via.nbnp.databaseserver.domain.Conversation(
                    buyer.get(),
                    seller.get(),
                    item.get()
            );
            dk.via.nbnp.databaseserver.domain.Conversation generated = conversationRepository.save(conversation);
            responseObserver.onNext(ConversationMapper.mapDomainToProto(generated));
            responseObserver.onCompleted();
        }
    }
    @Override
    public void getConversationsByUser(SearchConversationDTO request, StreamObserver<Conversation> responseObserver) {
        List<dk.via.nbnp.databaseserver.domain.Conversation> conversationList = conversationRepository.findAllBySellerIdOrBuyerId(request.getId(), request.getId());
        for (dk.via.nbnp.databaseserver.domain.Conversation conversation : conversationList) {
            responseObserver.onNext(ConversationMapper.mapDomainToProto(conversation));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getConversationById(SearchConversationDTO request, StreamObserver<Conversation> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.Conversation> conversation = conversationRepository.findById(request.getId());
        if(conversation.isEmpty()){
            System.out.println("No Conversation with id {"+request.getId()+"} was found.");
            responseObserver.onError(new Exception("No Conversation with id {"+request.getId()+"} was found."));
        }else{
            responseObserver.onNext(ConversationMapper.mapDomainToProto(conversation.get()));
            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteConversationById(SearchConversationDTO request, StreamObserver<Conversation> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.Conversation> conversation = conversationRepository.findById(request.getId());
        responseObserver.onNext(ConversationMapper.mapDomainToProto(conversation.get()));
        conversationRepository.deleteById(request.getId());
        responseObserver.onCompleted();
    }


}
