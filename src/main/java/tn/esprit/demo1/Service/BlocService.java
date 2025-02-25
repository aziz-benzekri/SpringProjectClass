package tn.esprit.demo1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.demo1.Entity.Bloc;
import tn.esprit.demo1.Repository.IBlocRepository;

import java.util.List;


@Service
public class BlocService implements IBlocService {
    @Autowired
    private IBlocRepository blocRepository;


    @Override
    public List<Bloc> retrieveBlocs() {
        return (List<Bloc>) blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> retrieveBloc(long idBloc) {
        return blocRepository.findById(idBloc);
    }

    @Override
    public void removeBloc(long idBloc) {
        blocRepository.deleteById(idBloc);

    }
}
