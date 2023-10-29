package MAIN.UI;

import MAIN.controller.AusbildungsInstitutService;
import MAIN.domain.AusbildungsInstitut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class AusbildungsInstitutCommands {

    @Autowired
    private AusbildungsInstitutService ausbildungsInstitutService;

    @ShellMethod("Add a new AusbildungsInstitut")
    public void addAusbildungsInstitut(Long id, String name, String ort) {
        AusbildungsInstitut ausbildungsInstitut = new AusbildungsInstitut(id, name, ort);
        ausbildungsInstitutService.saveAusbildungsInstitut(ausbildungsInstitut);
        System.out.println("AusbildungsInstitut added successfully!");
    }

    @ShellMethod("Delete an AusbildungsInstitut by ID")
    public void deleteAusbildungsInstitut(Long id) {
        ausbildungsInstitutService.deleteAusbildungsInstitutById(id);
        System.out.println("AusbildungsInstitut deleted successfully!");
    }

    @ShellMethod("List all AusbildungsInstitute")
    public void listAusbildungsInstitute() {
        ausbildungsInstitutService.getAllAusbildungsInstitute().forEach(System.out::println);
    }
}
