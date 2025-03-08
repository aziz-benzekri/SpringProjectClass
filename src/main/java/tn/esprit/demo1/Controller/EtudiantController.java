package tn.esprit.demo1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.demo1.Entity.Etudiant;
import tn.esprit.demo1.Service.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
    @Autowired
    private IEtudiantService etudiantService;

    @GetMapping("get")
    public List<Etudiant> getEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }
    @PostMapping("/create")
    public Etudiant createEtudiants(@RequestBody List<Etudiant> etudiants) {
        return (Etudiant) etudiantService.addEtudiants(etudiants);
    }
    @GetMapping("/all")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.retrieveAllEtudiants();

    }
    @DeleteMapping("/delete/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantService.removeEtudiant(id);
    }
    @GetMapping("/update/{etudiant}")
    public Etudiant updateEtudiant(@PathVariable Etudiant etudiant) {

        return etudiantService.updateEtudiant(etudiant);
    }


}