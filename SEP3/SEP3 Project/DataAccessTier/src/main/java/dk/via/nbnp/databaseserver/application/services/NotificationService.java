package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.application.mappers.NotificationMapper;
import dk.via.nbnp.databaseserver.protobuf.Empty;
import dk.via.nbnp.databaseserver.protobuf.Notification;
import dk.via.nbnp.databaseserver.protobuf.NotificationServiceGrpc;
import dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO;
import dk.via.nbnp.databaseserver.repositories.NotificationRepository;
import dk.via.nbnp.databaseserver.repositories.UserRepository;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@GRpcService
public class NotificationService extends NotificationServiceGrpc.NotificationServiceImplBase {

    private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository, UserRepository userRepository) {
        this.notificationRepository = notificationRepository;
    }
    
    @Override
    public void deleteNotificationById(SearchNotificationDTO request, StreamObserver<Empty> responseObserver) {
        notificationRepository.deleteById(request.getId());
        responseObserver.onCompleted();
    }

    @Override
    public void deleteNotificationsByUserId(SearchNotificationDTO request, StreamObserver<Empty> responseObserver) {
        notificationRepository.deleteAllByOwnerId(request.getId());
        responseObserver.onCompleted();
    }

    @Override
    public void getNotificationsByUser(SearchNotificationDTO request, StreamObserver<Notification> responseObserver) {
        List<dk.via.nbnp.databaseserver.domain.Notification> notifications =  notificationRepository.findAllByOwnerId(request.getId());
        for (dk.via.nbnp.databaseserver.domain.Notification n : notifications) {
           responseObserver.onNext(NotificationMapper.mapDomainToProto(n));
        }
        responseObserver.onCompleted();
    }
}
