package fr.uga.l3miage.tp2.exo2.module;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MANAGER")
public class Manager extends Employe {
    @Column
    private String niveauGestion;

    // Getters and Setters
}
