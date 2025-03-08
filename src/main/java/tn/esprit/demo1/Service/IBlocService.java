package tn.esprit.demo1.Service;

import tn.esprit.demo1.Entity.Bloc;

import java.util.List;
import java.util.Optional;

public interface IBlocService {
    List<Bloc> retrieveBlocs();
    Bloc updateBloc (Bloc bloc);
    Bloc addBloc (Bloc bloc);
    Bloc retrieveBloc (long idBloc);
    void removeBloc (long idBloc);
}
