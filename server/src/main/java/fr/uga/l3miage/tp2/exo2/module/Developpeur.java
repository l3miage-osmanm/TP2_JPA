package fr.uga.l3miage.tp2.exo2.module;
import javax.persistence.*;


@Entity
@DiscriminatorValue("DEVELOPPEUR")
public class Developpeur extends Employe {
    @Column
    private String langagePrefere;
    @Column
    private String niveauCompetence;

}
