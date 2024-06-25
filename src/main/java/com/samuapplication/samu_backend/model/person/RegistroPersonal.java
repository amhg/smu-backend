package com.samuapplication.samu_backend.model.person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="registroPersonal")
@Data
public class RegistroPersonal {

    @Id
    @Column(name = "curp")
    private java.lang.String curp;
    private String tipoRegistro;
    private String dia;
    private String hora;

}
