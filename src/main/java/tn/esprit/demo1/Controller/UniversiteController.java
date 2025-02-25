package tn.esprit.demo1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo1.Entity.Universite;
import tn.esprit.demo1.Service.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/Universite")
public class UniversiteController {
    @Autowired
    private IUniversiteService universiteService;

    @PostMapping("/create")
    public Universite createUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }
    @GetMapping("/get-by-id/{id}")
    public Universite getUniversiteById(@PathVariable long id) {
        return universiteService.retrieveUniversite(id);
    }
    @GetMapping
    public List<Universite> getAllUniversites() {
        return universiteService.retrieveAllUniversities();
    }
    @PutMapping("/update")
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

}
