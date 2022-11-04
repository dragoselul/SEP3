package dk.via.nbnp.databaseserver.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Product {

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
    private String name;
    private String description;
    private Double price;
    private String currency;
    private LocalDateTime dateOfAdding;
    private String category;
    private String status;

    public Product(){}

    public Product(String name, String description, Double price, String currency, String category, String status) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.currency = currency;
        this.dateOfAdding = LocalDateTime.now();
        this.category = category;
        this.status = status;
    }
    public Long getId() {
        return id;
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
    public String getCategory() {
        return category;
    }
    public String getStatus() {
        return status;
    }
    public String getCurrency() {
        return currency;
    }
}
