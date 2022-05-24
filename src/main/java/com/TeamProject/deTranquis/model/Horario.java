package com.TeamProject.deTranquis.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name="horario")
public class Horario {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    Long idHorario;

    @Getter
    @Setter
    @Column(name="DIA")
    String dia;

    @Getter
    @Setter
    @Column(name="HORARIOAPERTURA")
    String horarioApertura;

    @Getter
    @Setter
    @Column(name="HORARIOCIERRE")
    String horarioCierre;
}

