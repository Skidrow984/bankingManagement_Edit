package com.gestion.bank.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
@Entity
@Table(name = "GROUPE")
**/
@Getter
@Setter

public class Groupe {

    private String idCompte;
    private String intitule;

}
