package theoptimisers.citygardeners.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "CONTACT_POINT")
public class ContactPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_point_id")
    private Long id;

    @NotBlank(message = "Name can not be empty")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Country can not be empty")
    @Column(name = "country")
    private String country;

    @NotBlank(message = "City can not be empty")
    @Column(name = "city")
    private String city;

    @NotBlank(message = "Street can not be empty")
    @Column(name = "street")
    private String street;

    @NotBlank(message = "House number can not be empty")
    @Column(name = "house_nr")
    private String house_nr;

    public ContactPoint(String name, String country, String city, String street, String house_nr) {
        setName(name);
        setCountry(country);
        setCity(city);
        setStreet(street);
        setHouse_nr(house_nr);
    }

    public ContactPoint() {

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

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse_nr() {
        return house_nr;
    }

    public void setHouse_nr(String house_nr) {
        this.house_nr = house_nr;
    }
}
