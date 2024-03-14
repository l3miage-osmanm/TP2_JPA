package fr.uga.l3miage.tp2.exo1.models;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Table(name="developer_miage")
@Entity
public class DeveloperMiageEntity {
    @Id @Column(name="lastname") private String lastname;
    @Column(name="firstname") private String firstname;
    @Column(name="email") private String email;
    @ManyToMany()
    @JoinTable(
            name="developer_miage_project",
            joinColumns=@JoinColumn(name="lastname"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private Set<Projet> projets;

}
