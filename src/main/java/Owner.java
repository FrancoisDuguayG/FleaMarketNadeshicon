import java.util.List;

public class Owner {
    private String name;
    private String phone;
    private List<Flea> Fleas;

    public Owner(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Owner() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFleas(List<Flea> fleas) {
        Fleas = fleas;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public List<Flea> getFleas() {
        return Fleas;
    }
}
