package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.repositories.UserRepository;
import dk.via.nbnp.databaseserver.application.mappers.UserMapper;
import dk.via.nbnp.databaseserver.protobuf.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

@GRpcService
public class UserService extends UserServiceGrpc.UserServiceImplBase {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
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
        User gRPCUser = UserMapper.mapDomainToProto(createdUser);
        responseObserver.onNext(gRPCUser);
        responseObserver.onCompleted();
    }

    @Override
    public void login(LoginUserDTO request, StreamObserver<User> responseObserver) {
        String email = request.getEmail();
        String password = request.getPassword();

        Optional<dk.via.nbnp.databaseserver.domain.User> user = userRepository.findByEmailAndPassword(email, password);
        if (user.isEmpty()) {
            System.out.println("Incorrect email or password");
            responseObserver.onError(new Exception("Incorrect email or password"));
        } else {
            System.out.println(UserMapper.mapDomainToProto(user.get()));
            responseObserver.onNext(UserMapper.mapDomainToProto(user.get()));
            responseObserver.onCompleted();
            System.out.println("Successful login");
        }
    }

    @Override
    public void getUsers(SearchUserDTO request, StreamObserver<User> responseObserver) {
        ArrayList<dk.via.nbnp.databaseserver.domain.User> users = new ArrayList<>(userRepository.findAll());
        dk.via.nbnp.databaseserver.domain.User user;
        for (dk.via.nbnp.databaseserver.domain.User value : users) {
            if (value.getFirstName().toLowerCase().contains(request.getFirstName().toLowerCase()) ||
                    value.getLastName().toLowerCase().contains(request.getLastName().toLowerCase())) {
                user = value;
                User toSend = UserMapper.mapDomainToProto(user);
                responseObserver.onNext(toSend);
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getUserById(SearchUserDTO request, StreamObserver<User> responseObserver) {
        dk.via.nbnp.databaseserver.domain.User user;
        user = userRepository.findById(request.getId()).get();
        User toSend = UserMapper.mapDomainToProto(user);
        responseObserver.onNext(toSend);
        responseObserver.onCompleted();
    }

    @Override
    public void updateUser(UpdateUserDTO request, StreamObserver<User> responseObserver) {
        dk.via.nbnp.databaseserver.domain.User user;
        user = userRepository.findById(request.getId()).get();
        if (!user.getFirstName().equals(request.getFirstName()) && !request.getFirstName().isEmpty())
            user.setFirstName(request.getFirstName());
        if (!user.getLastName().equals(request.getLastName()) && !request.getLastName().isEmpty())
            user.setLastName(request.getLastName());
        if (!user.getEmail().equals(request.getEmail()) && !request.getEmail().isEmpty())
            user.setEmail(request.getEmail());
        if (user.isGender() != request.getGender())
            user.setGender(request.getGender());
        if (!user.getPassword().equals(request.getPassword()) && !request.getPassword().isEmpty())
            user.setPassword(request.getPassword());
        if (!user.getPhoneNumber().equals(request.getPhoneNumber()) && !request.getPhoneNumber().isEmpty())
            user.setPhoneNumber(request.getPhoneNumber());
        userRepository.save(user);
        User toSend = UserMapper.mapDomainToProto(user);
        responseObserver.onNext(toSend);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteUser(SearchUserDTO request, StreamObserver<User> responseObserver) {
        dk.via.nbnp.databaseserver.domain.User user;
        user = userRepository.findById(request.getId()).get();
        User toSend = UserMapper.mapDomainToProto(user);
        responseObserver.onNext(toSend);
        userRepository.deleteById(request.getId());
        responseObserver.onCompleted();
    }
}

