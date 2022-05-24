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
@Table (name = "promocion")
public class Promocion {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    Long idPromocion;

    @Getter
    @Setter
    @Column(name="TITULO")
    String titulo;

    @Getter
    @Setter
    @Column(name="DESCRIPCION")
    String descripcion;

    @Getter
    @Setter
    @Column(name="URL_IMAGEN")
    String urlImagen;

    @Getter
    @Setter
    @Column(name="ID_BAR")
    String idBar;
}
