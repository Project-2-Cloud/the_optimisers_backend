package theoptimisers.citygardeners.Model;

import com.sun.istack.NotNull;
import org.apache.logging.log4j.message.Message;

import javax.persistence.*;

@Entity
@Table(name = "CONTACT_POINT")
public class ContactPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String country;
    private String city;
    private String street;
    private int house_nr;

    public ContactPoint(String name, String country, String city, String street, int house_nr) {
        setName(name);
        setCountry(country);
        setCity(city);
        setStreet(street);
        setHouse_nr(house_nr);
    }

    public ContactPoint() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getHouse_nr() {
        return house_nr;
    }

    public void setHouse_nr(int house_nr) {
        this.house_nr = house_nr;
    }
}
