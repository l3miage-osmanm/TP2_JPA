package fr.uga.l3miage.tp2.exo2.module;

import javax.persistence.*;


@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public abstract class Employe {
    @Id private long id;
    @Column private String nom;
    @Column private String email;
    @Column private double salaire;
}
/*j'ai choisis le mode singletable, puisuq'ici les données sont assez simples, et il n'y a que quelque attributs qui sont different l'un d el'autre*/