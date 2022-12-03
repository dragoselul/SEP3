package dk.via.nbnp.databaseserver.application.services;

import dk.via.nbnp.databaseserver.protobuf.Notification;
import dk.via.nbnp.databaseserver.protobuf.NotificationServiceGrpc;
import dk.via.nbnp.databaseserver.protobuf.SearchNotificationDTO;
import dk.via.nbnp.databaseserver.repositories.NotificationRepository;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NotificationService extends NotificationServiceGrpc.NotificationServiceImplBase {

    private NotificationRepository notificationRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }


    @Override
    public void getNotificationsByUser(SearchNotificationDTO request, StreamObserver<Notification> responseObserver) {
        List<dk.via.nbnp.databaseserver.domain.Notification> notifications =  notificationRepository.findAllByOwnerId(request.getId());
        for (dk.via.nbnp.databaseserver.domain.Notification n : notifications) {
            responseObserver.onNext();
        }

    }
}
