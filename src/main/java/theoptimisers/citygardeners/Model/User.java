package theoptimisers.citygardeners.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name can not be empty")
    private String first_name;

    @NotBlank(message = "Last name can not be empty")
    private String last_name;

    @NotBlank(message = "Role can not be empty")
    private String role;

    @NotBlank(message = "City can not be empty")
    private String city;

    public User() {

    }

    public User(String first_name, String last_name, String role, String  city) {
        setFirst_name(first_name);
        setLast_name(last_name);
        setRole(role);
        setCity(city);
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
