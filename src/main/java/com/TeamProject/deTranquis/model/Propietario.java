package com.TeamProject.deTranquis.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "propietario")

public class Propietario {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    Long idProp;

    @Getter
    @Setter
    @Column(name = "NOMBRE")
    String nombreProp;

    @Getter
    @Setter
    @Column(name = "APELLIDO")
    String apellidoProp;

    @Getter
    @Setter
    @Column(name = "TELEFONO")
    String telefonoProp;
}
