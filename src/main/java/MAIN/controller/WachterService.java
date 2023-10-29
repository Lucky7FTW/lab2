package MAIN.controller;

import MAIN.repo.WachterRepository;
import MAIN.domain.Wachter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WachterService {

    @Autowired
    private WachterRepository wachterRepository;

    // Example method to retrieve all Wachter entities
    public List<Wachter> getAllWachters() {
        return wachterRepository.findAll();
    }

    // Example method to save a new Wachter entity
    public Wachter saveWachter(Wachter wachter) {
        return wachterRepository.save(wachter);
    }

    // Example method to find a Wachter by ID
    public Wachter getWachterById(Long id) {
        return wachterRepository.findById(id).orElse(null);
    }

    // Example method to delete a Wachter by ID
    public void deleteWachterById(Long id) {
        wachterRepository.deleteById(id);
    }
}
