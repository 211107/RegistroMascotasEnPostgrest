package com.example.registroMascotas.entity;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Datosdog")
public class Datosdog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //se cambio a text
    private Integer id;
    private String nombre;
    private String raza;
    private String fechaNacimiento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(Name nombre) {
        this.nombre = String.valueOf(nombre);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(Name raza) {
        this.raza = String.valueOf(raza);
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = String.valueOf(fechaNacimiento);
    }
}
