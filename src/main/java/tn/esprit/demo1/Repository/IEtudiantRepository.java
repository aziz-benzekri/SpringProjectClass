package tn.esprit.demo1.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo1.Entity.Etudiant;

public interface IEtudiantRepository extends CrudRepository<Etudiant, Long> {
}
