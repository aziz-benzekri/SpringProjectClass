package tn.esprit.demo1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo1.Entity.Chambre;
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


}
