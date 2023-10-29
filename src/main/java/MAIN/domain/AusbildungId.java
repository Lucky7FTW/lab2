package MAIN.domain;

import java.io.Serializable;
import java.util.Objects;

public class AusbildungId implements Serializable {

    private Long wachter;
    private Long ausbildungsInstitut;
    private String abschlussdatum;

    public AusbildungId() {}

    public AusbildungId(Long wachter, Long ausbildungsInstitut, String abschlussdatum) {
        this.wachter = wachter;
        this.ausbildungsInstitut = ausbildungsInstitut;
        this.abschlussdatum = abschlussdatum;
    }

    // Implement equals and hashCode methods (omitted for brevity)

    public Long getWachter() {
        return wachter;
    }

    public void setWachter(Long wachter) {
        this.wachter = wachter;
    }

    public Long getAusbildungsInstitut() {
        return ausbildungsInstitut;
    }

    public void setAusbildungsInstitut(Long ausbildungsInstitut) {
        this.ausbildungsInstitut = ausbildungsInstitut;
    }

    public String getAbschlussdatum() {
        return abschlussdatum;
    }

    public void setAbschlussdatum(String abschlussdatum) {
        this.abschlussdatum = abschlussdatum;
    }

    @Override
    public String toString() {
        return "AusbildungId{" +
                "wachter=" + wachter +
                ", ausbildungsInstitut=" + ausbildungsInstitut +
                ", abschlussdatum='" + abschlussdatum + '\'' +
                '}';
    }


}
