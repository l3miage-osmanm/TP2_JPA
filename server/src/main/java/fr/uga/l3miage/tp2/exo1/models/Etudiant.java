package fr.uga.l3miage.tp2.exo1.models;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="etudiant")
public class Etudiant {
    @Id @Column() private long agalan;
    @Column() private String nom;
    @Column() private String email;

    @ManyToMany(mappedBy = "etudiants")
    private Set<ClubSportif> clubs;
}
