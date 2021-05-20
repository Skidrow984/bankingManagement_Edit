package com.gestion.bank.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
/**
@Entity
@Table(name = "OPERATION")
**/
@Getter
@Setter

public class Operation {

    private String refOperation;
    private Date dateOperation;
    private String intitule;


}
