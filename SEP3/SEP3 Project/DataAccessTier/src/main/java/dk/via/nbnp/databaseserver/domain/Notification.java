package dk.via.nbnp.databaseserver.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.annotation.Nullable;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Notification {

    @Id
    @SequenceGenerator(
            name="notification_id_sequence",
            sequenceName = "notification_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "notification_id_sequence"
    )
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime dateSent;

    private String title;
    private String message;
    private String notificationType;
    private long notificationTypeId;

    @ManyToOne
    @JoinColumn(name = "ownerId")
    private User owner;

    public Notification(){}

    public Notification(String title, String message, User owner, String notificationType, long notificationTypeId) {
        this.title = title;
        this.message = message;
        this.notificationType = notificationType;
        this.notificationTypeId = notificationTypeId;
        this.owner = owner;
        this.dateSent = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }
    public LocalDateTime getDateSent() {
        return dateSent;
    }
    public String getTitle() {
        return title;
    }
    public String getMessage() {
        return message;
    }
    public User getOwner() {
        return owner;
    }
    public String getNotificationType() {
        return notificationType;
    }
    public long getNotificationTypeId() {
        return notificationTypeId;
    }
}
