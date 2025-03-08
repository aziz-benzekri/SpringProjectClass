package tn.esprit.demo1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo1.Entity.Chambre;
import tn.esprit.demo1.Entity.TypeChambre;
import tn.esprit.demo1.Service.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {

    @Autowired
    private IChambreService chambreService;


    @PostMapping("/create")
    public Chambre createChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @GetMapping("/all")
    public List<Chambre> getAllChambres() {
        return chambreService.retrieveAllChambres();
    }


    @GetMapping("/{id}")
    public Chambre getChambreById(@PathVariable Long id) {
        return chambreService.retrieveChambre(id);
    }

    @GetMapping("/update/{chambre}")
    public Chambre updateChambre(@PathVariable Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }


    @GetMapping("/getChambresParBlocEtType/{idBloc}/{typeChambre}")
    public List<Chambre> getChambresParBlocEtType(@PathVariable("nomUniversite") Long idBloc,
                                                      @PathVariable("typeChambre") String  typeChambre){

        TypeChambre chambreType = TypeChambre.valueOf(typeChambre.toUpperCase());
        return chambreService.getChambresParBlocEtType(idBloc,chambreType);
    }


    @GetMapping("/getChambresNonReserveParNomUniversiteEtType/{nomUniversite}/{typeChambre}")
    public List<Chambre> getChambresNonReserveParNomUniversiteEtType(@PathVariable("nomUniversite") String nomUniversite,
                                                                            @PathVariable("typeChambre") String  typeChambre){

        TypeChambre chambreType = TypeChambre.valueOf(typeChambre.toUpperCase());
        return chambreService.getChambresNonReserveParNomUniversiteEtTypeChambre(nomUniversite,chambreType);
    }



}
