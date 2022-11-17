package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.application.DAOInterfaces.UserRepository;
import dk.via.nbnp.databaseserver.mappers.UserMapper;
import dk.via.nbnp.databaseserver.protobuf.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.awt.*;
import java.util.ArrayList;
import java.util.Optional;

@GRpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

  /*  @Override
    public void serverSideStreamingGetListStockQuotes(Stock request, StreamObserver<StockQuote> responseObserver) {
        for (int i = 1; i <= 5; i++) {
            StockQuote stockQuote = StockQuote.newBuilder()
                    .setPrice(fetchStockPriceBid(request))
                    .setOfferNumber(i)
                    .setDescription("Price for stock:" + request.getTickerSymbol())
                    .build();
            responseObserver.onNext(stockQuote);
        }
        responseObserver.onCompleted();
    }

   */
    @Override
    public void login(LoginUserDTO request, StreamObserver<User> responseObserver) {
        String email = request.getEmail();
        String password = request.getPassword();

        //TODO Hash Password

        Optional<dk.via.nbnp.databaseserver.domain.User> user = userRepository.findByEmailAndPassword(email, password);
        if(user.isEmpty()){
            System.out.println("Incorrect email or password");
            responseObserver.onError(new Exception("Incorrect email or password"));
        }else{
            responseObserver.onNext(UserMapper.mapDomainToProto(user.get()));
            responseObserver.onCompleted();
        }
    }
    @Override
    public void getUsers(SearchUserDTO request, StreamObserver<User> responseObserver) {
        ArrayList<dk.via.nbnp.databaseserver.domain.User> users = new ArrayList<>(userRepository.findAll());
        dk.via.nbnp.databaseserver.domain.User user = null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getFirstName().equals(request.getFirstName()) || users.get(i).getLastName().equals(request.getLastName())) {
                user = users.get(i);
                LocalDateTime dateOfRegistration = LocalDateTime.newBuilder()
                        .setYear(user.getDateOfRegistration().getYear())
                        .setMonth(user.getDateOfRegistration().getMonthValue())
                        .setDay(user.getDateOfRegistration().getDayOfMonth())
                        .setHour(user.getDateOfRegistration().getHour())
                        .setMinute(user.getDateOfRegistration().getMinute())
                        .build();

                User toSend = User.newBuilder()
                        .setId(user.getId())
                        .setFirstName(user.getFirstName())
                        .setLastName(user.getLastName())
                        .setEmail(user.getEmail())
                        .setPhoneNumber(user.getPhoneNumber())
                        .setGender(user.isGender())
                        .setDateOfRegistration(dateOfRegistration)
                        .build();
                responseObserver.onNext(toSend);
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getUserById(SearchUserDTO request, StreamObserver<User> responseObserver) {
        dk.via.nbnp.databaseserver.domain.User user = null;
        user = userRepository.findById(request.getId()).get();
        LocalDateTime dateOfRegistration = LocalDateTime.newBuilder()
                .setYear(user.getDateOfRegistration().getYear())
                .setMonth(user.getDateOfRegistration().getMonthValue())
                .setDay(user.getDateOfRegistration().getDayOfMonth())
                .setHour(user.getDateOfRegistration().getHour())
                .setMinute(user.getDateOfRegistration().getMinute())
                .build();
        User toSend = User.newBuilder()
                .setId(user.getId())
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setEmail(user.getEmail())
                .setPhoneNumber(user.getPhoneNumber())
                .setGender(user.isGender())
                .setDateOfRegistration(dateOfRegistration)
                .build();
        responseObserver.onNext(toSend);
        responseObserver.onCompleted();
    }

    @Override
    public void updateUser(CreateUserDTO request, StreamObserver<User> responseObserver) {
        super.updateUser(request, responseObserver);
    }

    @Override
    public void deleteUser(SearchUserDTO request, StreamObserver<User> responseObserver) {
        super.deleteUser(request, responseObserver);
    }

    @Override
    public void createUser(CreateUserDTO request, StreamObserver<User> responseObserver) {
        dk.via.nbnp.databaseserver.domain.User user = new dk.via.nbnp.databaseserver.domain.User(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getPassword(),
                request.getPhoneNumber(),
                request.getGender()
        );

        dk.via.nbnp.databaseserver.domain.User createdUser = userRepository.save(user);

        User gRPCUser = User.newBuilder()
                .setId(createdUser.getId())
                .setFirstName(createdUser.getFirstName())
                .setLastName(createdUser.getLastName())
                .setEmail(createdUser.getEmail())
                .setPhoneNumber(createdUser.getPhoneNumber())
                .setGender(createdUser.isGender())
                .build();

        responseObserver.onNext(gRPCUser);
        responseObserver.onCompleted();
    }
}

