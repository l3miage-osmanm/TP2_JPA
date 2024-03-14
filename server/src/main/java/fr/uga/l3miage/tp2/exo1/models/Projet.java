package fr.uga.l3miage.tp2.exo1.models;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import java.math.BigInteger;

@Table(name="projet")
@Entity
public class Projet {
    @Id @Column() private BigInteger id;
    @Column() private String name;
    @Column() private String description;


    @ManyToMany(mappedBy="projets")
    private Set<DeveloperMiageEntity> devs;
}
