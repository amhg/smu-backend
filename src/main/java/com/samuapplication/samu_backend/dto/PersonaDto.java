package com.samuapplication.samu_backend.dto;

import com.samuapplication.samu_backend.model.person.Perfil;
import lombok.Data;

@Data
public class PersonaDto {
    private java.lang.String curp;
    private String rfc;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Perfil perfil;
}
