package dk.via.nbnp.databaseserver.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Message {

    @Id
    @SequenceGenerator(
            name="message_id_sequence",
            sequenceName = "message_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "message_id_sequence"
    )
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "senderId")
    private User sender;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "conversationId")
    private Conversation conversation;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime dateTimeSent;

    public Message(){}
    public Message(String content, User sender, Conversation conversation){
        this.content = content;
        this.sender = sender;
        this.dateTimeSent = LocalDateTime.now();
        this.conversation = conversation;
    }

    public User getSender() {
        return sender;
    }
    public Long getId() {
        return id;
    }
    public String getContent() {
        return content;
    }
    public Conversation getConversation() {
        return conversation;
    }
    public LocalDateTime getDateTimeSent() {
        return dateTimeSent;
    }

}
