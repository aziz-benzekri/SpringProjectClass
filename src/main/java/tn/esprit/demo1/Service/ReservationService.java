package tn.esprit.demo1.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.demo1.Entity.Reservation;
import tn.esprit.demo1.Repository.IReservationRepository;

import java.util.Date;
import java.util.List;

@Service
public class ReservationService implements IReservationService {

    @Autowired
    private IReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservation() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    public List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date annee, String nomUniversite) {
        return reservationRepository.getReservationParAnneeUniversitaireEtNomUniversite(annee, nomUniversite);
    }
}
