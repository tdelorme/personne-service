package fr.tde.personneservice.services;

import fr.tde.personneservice.models.Personne;
import fr.tde.personneservice.repositories.PersonneRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonneService {

    @Autowired
    private PersonneRepositories repositories;

    public Personne addPersonne(Personne personne) {

        return repositories.save(personne);

    }

    public void deletePersonneByUser(Long idUser) {
        List<Personne> listPersonne = repositories.findByIdUser(idUser);

        repositories.deleteAll(listPersonne);
    }

}
