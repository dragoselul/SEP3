package dk.via.nbnp.databaseserver.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Conversation {

    @Id
    @SequenceGenerator(
            name="conversation_id_sequence",
            sequenceName = "conversation_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "conversation_id_sequence"
    )
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime dateTimeOfStart;

    @ManyToOne
    @JoinColumn(name = "buyerId")
    private User buyer;

    @ManyToOne
    @JoinColumn(name = "sellerId")
    private User seller;

    @ManyToOne
    @JoinColumn(name = "itemId")
    private Item item;

    @OneToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "conversationId")
    private List<Message> messageList;

    public Conversation(){}

    public Conversation(User buyer, User seller, Item item){
        this.buyer = buyer;
        this.seller = seller;
        this.item = item;
        this.dateTimeOfStart = LocalDateTime.now();
        messageList = new ArrayList<>();
    }

    public Item getItem() {
        return item;
    }
    public User getBuyer() {
        return buyer;
    }
    public User getSeller() {
        return seller;
    }
    public Long getId() {
        return id;
    }
    public LocalDateTime getDateTimeOfStart() {
        return dateTimeOfStart;
    }
    public List<Message> getMessageList() {
        return messageList;
    }
}
