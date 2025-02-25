package tn.esprit.demo1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo1.Entity.Foyer;
import tn.esprit.demo1.Service.IEtudiantService;
import tn.esprit.demo1.Service.IFoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerController {

    @Autowired
    private IFoyerService foyerService;


    @PostMapping("/create")
    public Foyer createFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @GetMapping("/all")
    public List<Foyer> getAllFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    @GetMapping("/{id}")
    public Foyer getFoyerById(@PathVariable Long id) {
        return foyerService.retrieveFoyer(id);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteFoyer(@PathVariable Long id) {
        foyerService.removeFoyer(id);
    }
}
