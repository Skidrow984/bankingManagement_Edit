package com.gestion.bank.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "COMPTE")
@Getter
@Setter
@Data
public class Compte {

    @Id
    private String numCompte;
    @Column(name ="INTITULE")
    private String intitule;
    @Column(name ="NATURE")
    private int nature;
    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;

}