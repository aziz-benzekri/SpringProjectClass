package tn.esprit.demo1.Service;

import tn.esprit.demo1.Entity.Chambre;
import tn.esprit.demo1.Entity.TypeChambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);
    Chambre retrieveChambre (long idChambre);
     List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC);
     List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre typeChambre) ;
}
