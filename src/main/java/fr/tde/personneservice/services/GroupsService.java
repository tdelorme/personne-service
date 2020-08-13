package fr.tde.personneservice.services;

import fr.tde.personneservice.models.Groups;
import fr.tde.personneservice.repositories.GroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupsService {

    @Autowired
    private GroupsRepository groupsRepository;

    public Groups upsert(Groups groups) {

        return groupsRepository.save(groups);

    }

}
