package theoptimisers.citygardeners.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "WORKSHOP")
public class Workshop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workshop_id")
    private Long workshop_id;

    @NotNull(message = "Gardener id can not be empty")
    @Column(name = "gardener_id")
    private Long gardener_id;

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

    @NotNull(message = "House number can not be empty")
    @Column(name = "house_nr")
    private Integer house_nr;

    @NotBlank(message = "Date can not be empty")
    @Column(name = "date")
    private LocalDate date;

    @NotBlank(message = "Time can not be empty")
    @Column(name = "time")
    private LocalTime time;

    public Workshop() {

    }

    public Workshop(String name, String country, String city, String street, int house_nr, LocalDate date, LocalTime time) {
        setName(name);
        setCountry(country);
        setCity(city);
        setStreet(street);
        setHouse_nr(house_nr);
        setDate(date);
        setTime(time);
    }

    public Long getWorkshop_id() {
        return workshop_id;
    }

    public void setWorkshop_id(Long workshop_id) {
        this.workshop_id = workshop_id;
    }

    public Long getGardener_id() {
        return gardener_id;
    }

    public void setGardener_id(Long gardener_id) {
        this.gardener_id = gardener_id;
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

    public Integer getHouse_nr() {
        return house_nr;
    }

    public void setHouse_nr(Integer house_nr) {
        this.house_nr = house_nr;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
