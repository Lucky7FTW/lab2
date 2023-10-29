package MAIN.UI;

import MAIN.controller.AusbildungService;
import MAIN.domain.Ausbildung;
import MAIN.domain.AusbildungId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class AusbildungCommands {

    @Autowired
    private AusbildungService ausbildungService;

    @ShellMethod("Add a new Ausbildung")
    public void addAusbildung(Long wachterId, Long ausbildungsInstitutId, String abschlussdatum, String ausbildungsspezialisierung) {
        AusbildungId id = new AusbildungId(wachterId, ausbildungsInstitutId, abschlussdatum);
        Ausbildung ausbildung = new Ausbildung(id, ausbildungsspezialisierung);
        ausbildungService.saveAusbildung(ausbildung);
        System.out.println("Ausbildung added successfully!");
    }

    @ShellMethod("Delete an Ausbildung by ID")
    public void deleteAusbildung(Long wachterId, Long ausbildungsInstitutId, String abschlussdatum) {
        ausbildungService.deleteAusbildungByWachterAndAusbildungsInstitut(wachterId, ausbildungsInstitutId, abschlussdatum);
        System.out.println("Ausbildung deleted successfully!");
    }

    @ShellMethod("List all Ausbildungen")
    public void listAusbildungen() {
        ausbildungService.getAllAusbildungen().forEach(System.out::println);
    }

    @ShellMethod("Get an Ausbildung by ID")
    public void getAusbildung(Long wachterId, Long ausbildungsInstitutId, String abschlussdatum) {
        AusbildungId id = new AusbildungId(wachterId, ausbildungsInstitutId, abschlussdatum);
        ausbildungService.getAusbildungByWachterAndAusbildungsInstitut(wachterId, ausbildungsInstitutId, abschlussdatum)
                .ifPresentOrElse(System.out::println, () -> System.out.println("Ausbildung not found"));
    }
}
