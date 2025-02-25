package tn.esprit.demo1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation implements Serializable {
    
    @Id
    private String idReservation;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private boolean estValide;
    @ManyToOne
    private Etudiant etudiant;
    @ManyToMany
    private Set<Etudiant> etudiants;
}
