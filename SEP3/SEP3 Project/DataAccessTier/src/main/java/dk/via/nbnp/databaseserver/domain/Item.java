package dk.via.nbnp.databaseserver.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Item {

    @Id
    @SequenceGenerator(
            name="item_id_sequence",
            sequenceName = "item_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "item_id_sequence"
    )
    private Long id;

    private String name;

    private String description;

    private Double price;

    private String currency;

    private boolean status;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime dateOfAdding;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "ownerId")
    private User owner;

    @OneToMany
    @JoinColumn(name = "itemId")
    private List<Image> imagesList;

    public Item(){}

    public Item(String name, String description, Double price, String currency, Category category, boolean status, User owner) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.currency = currency;
        this.dateOfAdding = LocalDateTime.now();
        this.category = category;
        this.status = status;
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }
    public User getOwner() {
        return owner;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public LocalDateTime getDateOfAdding() {
        return dateOfAdding;
    }
    public Category getCategory() {
        return category;
    }
    public boolean getStatus() {
        return status;
    }
    public String getCurrency() {
        return currency;
    }
    public List<Image> getImages() { return imagesList; }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", dateOfAdding=" + dateOfAdding +
                ", category='" + category + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
