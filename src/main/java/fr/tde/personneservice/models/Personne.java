package fr.tde.personneservice.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "personne")
@Data
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String company;

    @Column
    private Long idUser;
}
