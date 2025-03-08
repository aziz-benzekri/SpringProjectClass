package tn.esprit.demo1.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.demo1.Entity.Chambre;
import tn.esprit.demo1.Entity.TypeChambre;

import java.util.List;

@Repository
public interface IChambreRepository extends CrudRepository<Chambre,Long> {

    @Query("SELECT c FROM Chambre c WHERE c.bloc.foyer.universite.nomUniversite = :nomUniversite " +
            "AND c.typeChambre = :type " +
            "AND c NOT IN (SELECT r FROM Reservation r JOIN r.etudiants e WHERE r.estValide = true)")
    List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type);


    @Query("SELECT c FROM Chambre c WHERE c.bloc.idBloc = :idBloc AND c.typeChambre = :type")
    public List<Chambre> getChambresParBlocEtType(Long idBloc, TypeChambre type);

}
