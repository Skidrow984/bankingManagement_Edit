package com.gestion.bank.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
/**
@Entity
@Table(name = "EMPLOYE")
 **/
@Getter
@Setter

public class Employe {

    private String idEmploye;
    private String matricule;
    private String firstName;
    private String lastName;
    private List<Compte> listCompte;

}
