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
@Table(name="perfil")
@Data
public class Perfil {
    @Id
    @Column(name = "curp")
    private java.lang.String curp;
    private String rfc;
    private String ocupacion;
    private String area;
    private String puesto;

    @Column(insertable=false, updatable=false)
    private String cluesreal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cluesreal")
    private Hospital perfilHospital;

    public Perfil(){
    }
}
