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
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private long cin ;
    private String ecole ;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance ;
    @OneToMany(mappedBy = "etudiant")
    private Set<Reservation> reservation ;
}
