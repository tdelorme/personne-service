package fr.tde.personneservice.controllers;

import fr.tde.personneservice.models.Groups;
import fr.tde.personneservice.services.GroupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groups")
public class GroupsController {

    @Autowired
    private GroupsService groupsService;

    @PostMapping("upsert")
    public ResponseEntity<Groups> upsert(Groups groups) {
        Groups groupsSaved = this.groupsService.upsert(groups);
        if (groupsSaved != null && groupsSaved.getId() != null) {
            return ResponseEntity.ok(groupsSaved);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

}
