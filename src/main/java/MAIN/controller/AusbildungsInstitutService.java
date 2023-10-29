package MAIN.controller;

import MAIN.domain.AusbildungsInstitut;
import MAIN.repo.AusbildungsInstitutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AusbildungsInstitutService {

    @Autowired
    private AusbildungsInstitutRepository ausbildungsInstitutRepository;

    public List<AusbildungsInstitut> getAllAusbildungsInstitute() {
        return ausbildungsInstitutRepository.findAll();
    }

    public Optional<AusbildungsInstitut> getAusbildungsInstitutById(Long id) {
        return ausbildungsInstitutRepository.findById(id);
    }

    public void saveAusbildungsInstitut(AusbildungsInstitut ausbildungsInstitut) {
        ausbildungsInstitutRepository.save(ausbildungsInstitut);
    }

    public void deleteAusbildungsInstitutById(Long id) {
        ausbildungsInstitutRepository.deleteById(id);
    }
}