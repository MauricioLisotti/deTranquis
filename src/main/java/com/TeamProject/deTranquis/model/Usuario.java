package com.TeamProject.deTranquis.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long idUsuario;

    @Getter
    @Setter
    @Column(name = "nickname")
    String nicknameUsuario;

    @Getter
    @Setter
    @Column(name = "clave")
    String claveUsuario;

    @Getter
    @Setter
    @Column(name = "nombre")
    String nombreUsuario;

    @Getter
    @Setter
    @Column(name = "apellido")
    String apellidoUsuario;

    @Getter
    @Setter
    @Column(name = "correo")
    String correoUsuario;
}
