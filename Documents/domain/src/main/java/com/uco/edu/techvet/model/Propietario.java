package com.uco.edu.techvet.model;

import com.uco.edu.techvet.model.parametro.TipoPersonaEnum;

public class Propietario {
    private String nombre;
    private int identificacion;
    private int edad;
    private int telefono;
    private String correoElectronico;
    private TipoPersonaEnum tipoPersona;

    public Propietario(String nombre, int identificacion, int edad, int telefono, String correoElectronico, TipoPersonaEnum tipoPersona) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.tipoPersona = tipoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public TipoPersonaEnum getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersonaEnum tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
}
