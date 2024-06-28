package com.samuapplication.samu_backend.model.person;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="persona")
@Data
public class Persona {

    @Id
    @Column(name = "curp")
    private java.lang.String curp;
    private String rfc;
    private String nombre;
    private String apellido1;
    private String apellido2;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "curp")
     private Perfil personPerfil;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "curp", nullable=false)
    private RegistroPersonal registroPersonal;

    public Persona(){}
}
