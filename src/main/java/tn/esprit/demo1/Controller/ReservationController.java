package tn.esprit.demo1.Controller;


import org.springframework.web.bind.annotation.*;
import tn.esprit.demo1.Entity.Etudiant;
import tn.esprit.demo1.Entity.Reservation;
import tn.esprit.demo1.Service.IReservationService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Reservation")
public class ReservationController {
    private IReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAllReservations() {
        return reservationService.retrieveAllReservation();
    }
    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable String id) {
        return reservationService.retrieveReservation(id);
    }

    @GetMapping("/update/{Reservation}")
    public Reservation updateReservation(@PathVariable Reservation reservation) {

        return reservationService.updateReservation(reservation);
    }


    @GetMapping("/par-annee-universitaire/{anneUniversitaire}/{nomUniversite}")
    public List<Reservation> getReservations(
            @PathVariable("anneUniversitaire") Date anneeUniv, @PathVariable("nomUniversite") String nomUniversite) {
        return reservationService.getReservationParAnneeUniversitaireEtNomUniversite(anneeUniv, nomUniversite);
          }


}
