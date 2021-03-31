package theoptimisers.citygardeners;

public class User {

    private Long id;
    private String first_name;
    private String last_name;
    private String role;
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
