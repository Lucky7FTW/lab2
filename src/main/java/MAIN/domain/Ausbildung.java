package MAIN.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "ausbildung")
public class Ausbildung {

    @EmbeddedId
    private AusbildungId id;

    @Column(name = "ausbildungsspezialisierung")
    private String ausbildungsspezialisierung;

    public Ausbildung() {
        // Default constructor
    }

    public Ausbildung(AusbildungId id, String ausbildungsspezialisierung) {
        this.id = id;
        this.ausbildungsspezialisierung = ausbildungsspezialisierung;
    }

    public AusbildungId getId() {
        return id;
    }

    public void setId(AusbildungId id) {
        this.id = id;
    }

    public String getAusbildungsspezialisierung() {
        return ausbildungsspezialisierung;
    }

    public void setAusbildungsspezialisierung(String ausbildungsspezialisierung) {
        this.ausbildungsspezialisierung = ausbildungsspezialisierung;
    }

    @Override
    public String toString() {
        return "Ausbildung{" +
                "id=" + id +
                ", ausbildungsspezialisierung='" + ausbildungsspezialisierung + '\'' +
                '}';
    }
}
