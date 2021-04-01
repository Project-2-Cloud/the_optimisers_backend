package theoptimisers.citygardeners.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "VEGETABLE")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vegetable_id")
    private Long vegetable_id;

    @NotBlank(message = "Title can not be empty")
    @Column(name = "title")
    private String title;

    @NotBlank(message = "Description can not be empty")
    @Column(name = "discription")
    private String description;

    @NotBlank(message = "Thumbnail url can not be empty")
    @Column(name = "thumbnail_url")
    private String thumbnail_url;

    @NotNull(message = "Price can not be empty")
    @Column(name = "price")
    private float price;

    public Product() {

    }

    public Product(String title, String description, String thumbnail_url, float price) {
        setId(vegetable_id);
        setTitle(title);
        setDescription(description);
        setThumbnail_url(thumbnail_url);
        setPrice(price);
    }

    public Long getId() {
        return vegetable_id;
    }

    public void setId(Long id) {
        this.vegetable_id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
