package tn.esprit.demo1.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.demo1.Entity.Etudiant;

import java.util.List;

@Repository
public interface IEtudiantRepository extends CrudRepository<Etudiant, Long> {

}
