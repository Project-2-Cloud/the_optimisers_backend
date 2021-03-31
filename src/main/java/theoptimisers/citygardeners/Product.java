package theoptimisers.citygardeners;

public class Product {

    private int vegetable_id;
    private String title;
    private String description;
    private String thumbnail_url;
    private float price;

    public Product() {

    }

    public Product(int vegetable_id, String title, String description, String thumbnail_url, float price) {
        super();
        setId(vegetable_id);
        setTitle(title);
        setDescription(description);
        setThumbnail_url(thumbnail_url);
        setPrice(price);
    }

    public int getId() {
        return vegetable_id;
    }

    public void setId(int id) {
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
