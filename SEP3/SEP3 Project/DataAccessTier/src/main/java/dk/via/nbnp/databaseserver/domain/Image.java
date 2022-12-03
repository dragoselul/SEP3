package dk.via.nbnp.databaseserver.domain;

import javax.persistence.*;

@Entity
@Table
public class Image {

    @Id
    @SequenceGenerator(
            name="image_id_sequence",
            sequenceName = "image_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "image_id_sequence"
    )
    private Long id;
    @Column(columnDefinition="text")
    private String base64data;
    private String contentType;
    private String fileName;

        @ManyToOne
    @JoinColumn(name="itemId")
    private Item item;

    public Image() {
    }

    public Image(Long id, String base64data, String contentType, String fileName, Item item) {
        this.id = id;
        this.base64data = base64data;
        this.contentType = contentType;
        this.fileName = fileName;
        this.item = item;
    }

    public Image(String base64data, String contentType, String fileName, Item item) {
        this.base64data = base64data;
        this.contentType = contentType;
        this.fileName = fileName;
        this.item = item;
    }

    public Long getId() {
        return id;
    }

    public String getBase64data() {
        return base64data;
    }

    public String getContentType() {
        return contentType;
    }

    public String getFileName() {
        return fileName;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", base64data='" + base64data + '\'' +
                ", contentType='" + contentType + '\'' +
                ", fileName='" + fileName + '\'' +
                ", item=" + item +
                '}';
    }
}
