package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.application.DAOInterfaces.UserRepository;
import dk.via.nbnp.databaseserver.protobuf.CreateUserDTO;
import dk.via.nbnp.databaseserver.protobuf.SearchUserDTO;
import dk.via.nbnp.databaseserver.protobuf.User;
import dk.via.nbnp.databaseserver.protobuf.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.util.Optional;

@GRpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void getUser(SearchUserDTO request, StreamObserver<User> responseObserver) {
        Optional<dk.via.nbnp.databaseserver.domain.User> daoResponse = userRepository.findById(request.getId());

        if(daoResponse.isEmpty()){
            System.out.println("User with this Id was not found");
        }else{
            dk.via.nbnp.databaseserver.domain.User user = daoResponse.get();
            User.LocalDateTime dateOfRegistration = User.LocalDateTime.newBuilder()
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
