package tn.esprit.demo1.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.demo1.Entity.Foyer;

public interface IFoyerRepository extends CrudRepository<Foyer,Long> {
}
