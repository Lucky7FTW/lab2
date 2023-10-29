package MAIN.domain;
import jakarta.persistence.*;

@Entity
@Table(name = "ausbildungs_institut")
public class AusbildungsInstitut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "ort")
    private String ort;

    public AusbildungsInstitut() {
        // Default constructor
    }

    public AusbildungsInstitut(Long id, String name, String ort) {
        this.id = id;
        this.name = name;
        this.ort = ort;
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

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "AusbildungsInstitut{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ort='" + ort + '\'' +
                '}';
    }
}
