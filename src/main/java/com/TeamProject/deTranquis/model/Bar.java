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
@Table(name = "bar")

public class Bar {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long idBar;

    @Getter
    @Setter
    @Column(name = "NOMBRE")
    String nombreBar;

    @Getter
    @Setter
    @Column(name = "TELEFONO")
    String telefonoBar;

    @Getter
    @Setter
    @Column(name = "IMAGENBAR")
    String imagenBar;

    @Getter
    @Setter
    @Column(name = "DIRECCION")
    String direccionBar;

    @Getter
    @Setter
    @Column(name = "CATPRECIO")
    String catPrecio;

    @Getter
    @Setter
    @Column(name = "AREA")
    String areabar;

    @Getter
    @Setter
    @Column(name = "CATEGORIA")
    String categoriaBar;

    @Getter
    @Setter
    @Column(name = "DESCRIPCION")
    String descripcionBar;

    @Getter
    @Setter
    @Column(name = "ESPECIALIDADES")
    String especialidadesBar;

    @Getter
    @Setter
    @Column(name = "redessociales")
    String redesSociales;

    @Getter
    @Setter
    @Column(name = "id_propietario_propietario")
    String idPropietario;
}

