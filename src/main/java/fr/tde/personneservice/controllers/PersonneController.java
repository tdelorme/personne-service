package fr.tde.personneservice.controllers;

import fr.tde.personneservice.models.Personne;
import fr.tde.personneservice.services.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/personne")
public class PersonneController {

    @Autowired
    private PersonneService service;

    @PutMapping("/upsert")
    public ResponseEntity fillProfil(@RequestBody Personne personne) {

        Personne personneSaved = service.addPersonne(personne);

        if(personneSaved != null && personneSaved.getId() != null) {
            return ResponseEntity.ok().build();
        }
        else {
            return ResponseEntity.badRequest().body("Error while attempting to save in dabatase");
        }
    }

    @DeleteMapping("/delete/user")
    public void deleteProfilByUser(@RequestParam Long idUser) {
        service.deletePersonneByUser(idUser);
    }

}
