package MAIN.UI;

import MAIN.controller.WachterService;
import MAIN.domain.Wachter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class WachterCommands {

    @Autowired
    private WachterService wachterService;

    @ShellMethod("Add a new Wachter")
    public void addWachter(Long id, String wachposten, String name, String geschlecht, String anstellungdatum, int gehalt, String telefonnummer) {
        Wachter wachter = new Wachter(id, wachposten, name, geschlecht, anstellungdatum, gehalt, telefonnummer);
        wachterService.saveWachter(wachter);
        System.out.println("Wachter added successfully!");
    }

    @ShellMethod("Delete a Wachter by ID")
    public void deleteWachter(Long id) {
        wachterService.deleteWachterById(id);
        System.out.println("Wachter deleted successfully!");
    }

    @ShellMethod("List all Wachters")
    public void listWachters() {
        wachterService.getAllWachters().forEach(System.out::println);
    }
}
