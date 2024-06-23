package com.samuapplication.samu_backend.model.person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="hospital")
@Data
public class Hospital {
    @Id
    @Column(name = "cluesreal")
    private java.lang.String cluesreal;
    private String jurisdiccion;
    private String descripcion;

    public Hospital(){}

}
