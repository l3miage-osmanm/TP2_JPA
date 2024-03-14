package fr.uga.l3miage.tp2.exo1.models;
import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name="ClubSportif")
public class ClubSportif {
    @Id @Column() private long id;
    @Column() private String nom;
    @Column() private String description;

    @ManyToMany()
    private Set<Etudiant> etudiants;
}
