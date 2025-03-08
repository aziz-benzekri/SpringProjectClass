package tn.esprit.demo1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.demo1.Entity.Chambre;
import tn.esprit.demo1.Entity.TypeChambre;
import tn.esprit.demo1.Repository.IChambreRepository;

import java.util.List;

@Service
public class ChambreService implements IChambreService {
    @Autowired
    private IChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return (List<Chambre>) chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }


    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
        return chambreRepository.getChambresParBlocEtType(idBloc, typeC);
    }

    @Override
    public List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre typeChambre) {
        return chambreRepository.getChambresNonReserveParNomUniversiteEtTypeChambre(nomUniversite, typeChambre);

    }
}
