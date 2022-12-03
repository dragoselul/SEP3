package dk.via.nbnp.databaseserver.application.mappers;

import dk.via.nbnp.databaseserver.protobuf.Notification;

public class NotificationMapper {

    public static Notification mapDomainToProto(dk.via.nbnp.databaseserver.domain.Notification notification){
        return Notification.newBuilder().
                setId(notification.getId()).
                setMessage(notification.getMessage()).
                setNotificationType(notification.getNotificationType()).
                setNotificationTypeId(notification.getNotificationTypeId()).
                setTitle(notification.getTitle()).
                setOwnerId(notification.getOwner().getId()).
                setDateSent(LocalDateMapper.mapDomainToProto(notification.getDateSent())).
                build();
    }

}
