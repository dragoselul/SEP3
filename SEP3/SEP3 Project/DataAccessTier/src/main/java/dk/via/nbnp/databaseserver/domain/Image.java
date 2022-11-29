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
    private byte[] image;

    @ManyToOne
    @JoinColumn(name="itemId")
    private Item item;

}
