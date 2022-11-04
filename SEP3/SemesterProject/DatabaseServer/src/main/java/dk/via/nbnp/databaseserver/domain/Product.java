package dk.via.nbnp.databaseserver.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

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

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
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
