package tn.esprit.demo1.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo1.Entity.Bloc;
import tn.esprit.demo1.Entity.Etudiant;
import tn.esprit.demo1.Service.BlocService;
import tn.esprit.demo1.Service.IBlocService;
import tn.esprit.demo1.Service.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/Bloc")
public class BlocController {

    @Autowired
    public IBlocService blocService;

    @PostMapping("create")
    public Bloc createBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @GetMapping("get-by-id/{id}")
    public Bloc getBlocById(@PathVariable long id) {

        return blocService.retrieveBloc(id);
    }

    @GetMapping("get-all")
    public List<Bloc> getAllBloc() {
        return blocService.retrieveBlocs();
    }

    @PutMapping("update")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @DeleteMapping("delete/{id}")
    public void deleteBloc(@PathVariable long id) {
        blocService.removeBloc(id);
    }
    
}
