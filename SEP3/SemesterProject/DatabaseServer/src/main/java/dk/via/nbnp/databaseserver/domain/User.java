package dk.via.nbnp.databaseserver.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.time.LocalDateTime;

public class User {

    @Id
    @SequenceGenerator(
            name="product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
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

    public User(String firstName, String lastName, String email, String password, String phoneNumber, boolean gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
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
}
