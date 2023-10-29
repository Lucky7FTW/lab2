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

    public List<Wachter> getAllWachters() {
        return wachterRepository.findAll();
    }

    public Wachter saveWachter(Wachter wachter) {
        return wachterRepository.save(wachter);
    }

    public Wachter getWachterById(Long id) {
        return wachterRepository.findById(id).orElse(null);
    }

    public void deleteWachterById(Long id) {
        wachterRepository.deleteById(id);
    }
}
