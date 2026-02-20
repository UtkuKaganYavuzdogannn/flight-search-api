import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "airports")
public class Airport {

    @Column(name = "airport_id" , nullable = false)
    @Id
    @GeneratedValue
    private UUID id;

    @Column(length = 50, nullable = false)
    private String city;

    protected Airport() {
    }

    public Airport( String city) {
        this.city = city;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
