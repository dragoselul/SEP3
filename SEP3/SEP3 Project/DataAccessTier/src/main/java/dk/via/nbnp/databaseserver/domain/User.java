package dk.via.nbnp.databaseserver.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@JsonPOJOBuilder
@Table(name="\"user\"")

public class User {

    // TODO USER SHOULD NOT STORE PASSWORD
    @Id
    @SequenceGenerator(
            name="user_id _sequence",
            sequenceName = "user_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_sequence"
    )
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String phoneNumber;

    private boolean gender;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime dateOfRegistration;

    @OneToMany
    @JsonIgnore
    @JoinColumn(name="ownerId")
    private List<Item> itemsOwned;

    public User(){}

    public User(Long id, String firstName, String lastName, String email, String password, String phoneNumber, boolean gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.dateOfRegistration = LocalDateTime.now();
        this.gender = gender;
    }

    public User(String firstName, String lastName, String email, String password, String phoneNumber, boolean gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.dateOfRegistration = LocalDateTime.now();
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public boolean isGender() {
        return gender;
    }
    public LocalDateTime getDateOfRegistration() {
        return dateOfRegistration;
    }
    public List<Item> getItemsOwned(){
        return itemsOwned;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
