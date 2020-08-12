package fr.tde.personneservice.repositories;

import fr.tde.personneservice.models.Personne;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PersonneRepositories extends CrudRepository<Personne, Long> {

    List<Personne> findByIdUser(Long idUser);

}
