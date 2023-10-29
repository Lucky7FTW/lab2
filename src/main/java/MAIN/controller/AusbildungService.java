package MAIN.controller;

import MAIN.domain.*;
import MAIN.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AusbildungService {

    @Autowired
    private AusbildungRepository ausbildungRepository;

    public List<Ausbildung> getAllAusbildungen() {
        return ausbildungRepository.findAll();
    }

    public Optional<Ausbildung> getAusbildungByWachterAndAusbildungsInstitut(Long wachterId, Long ausbildungsInstitutId, String abschlussdatum) {
        return ausbildungRepository.findById(new AusbildungId(wachterId, ausbildungsInstitutId, abschlussdatum));
    }

    public void saveAusbildung(Ausbildung ausbildung) {
        ausbildungRepository.save(ausbildung);
    }

    public void deleteAusbildungByWachterAndAusbildungsInstitut(Long wachterId, Long ausbildungsInstitutId, String abschlussdatum) {
        ausbildungRepository.deleteById(new AusbildungId(wachterId, ausbildungsInstitutId, abschlussdatum));
    }
}
