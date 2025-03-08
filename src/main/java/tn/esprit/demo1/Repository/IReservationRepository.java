package tn.esprit.demo1.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.demo1.Entity.Reservation;

import java.util.Date;
import java.util.List;

@Repository
public interface IReservationRepository extends CrudRepository<Reservation,String> {

    @Query("SELECT r FROM Reservation r " +
            "JOIN r.chambre c " +
            "JOIN c.bloc b " +
            "JOIN b.foyer f " +
            "JOIN f.universite u " +
            "WHERE u.nomUniversite = :nomUniversite " +
            "AND FUNCTION('YEAR', r.anneeUniversitaire) = :anneeUniversite")
    List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(
            Date anneeUniversite, String nomUniversite);
    

}
