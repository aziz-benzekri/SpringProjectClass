package tn.esprit.demo1.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.demo1.Entity.Etudiant;
import tn.esprit.demo1.Entity.Reservation;
import tn.esprit.demo1.Service.IReservationService;

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
    public Etudiant updateEtudiant(@PathVariable Reservation reservation) {

        return reservationService.updateReservation(reservation).getEtudiant();
    }

}
