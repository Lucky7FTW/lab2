package MAIN.domain;
import jakarta.persistence.*;
@Entity
@Table(name = "wachter")
public class Wachter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name = "wachposten")
    private String wachposten;

    @Column(name = "name")
    private String name;

    @Column(name = "geschlecht")
    private String geschlecht;

    @Column(name = "anstellungdatum")
    private String anstellungdatum;

    @Column(name = "gehalt")
    private int gehalt;

    @Column(name = "telefonnummer")
    private String telefonnummer;
    public Wachter(Long id, String wachposten, String name, String geschlecht, String anstellungdatum, int gehalt, String telefonnummer) {
        this.id = id;
        this.wachposten = wachposten;
        this.name = name;
        this.geschlecht = geschlecht;
        this.anstellungdatum = anstellungdatum;
        this.gehalt = gehalt;
        this.telefonnummer = telefonnummer;
    }

    public Wachter() {
    }


    @Override
    public String toString() {
        return "Wachter{" +
                "id=" + id +
                ", wachposten='" + wachposten + '\'' +
                ", name='" + name + '\'' +
                ", geschlecht='" + geschlecht + '\'' +
                ", anstellungdatum='" + anstellungdatum + '\'' +
                ", gehalt=" + gehalt +
                ", telefonnummer='" + telefonnummer + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getWachposten() {
        return wachposten;
    }

    public String getName() {
        return name;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public String getAnstellungdatum() {
        return anstellungdatum;
    }

    public int getGehalt() {
        return gehalt;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWachposten(String wachposten) {
        this.wachposten = wachposten;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public void setAnstellungdatum(String anstellungdatum) {
        this.anstellungdatum = anstellungdatum;
    }

    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

}
