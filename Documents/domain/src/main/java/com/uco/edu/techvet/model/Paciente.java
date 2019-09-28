package com.uco.edu.techvet.model;

import com.uco.edu.techvet.model.businessexception.EdadNegativaException;
import com.uco.edu.techvet.model.businessexception.PesoNegativoException;

public class Paciente {
    private String nombrePaciente;
    private double peso;
    private int edad;
    private Raza tipoRaza;
    private String genero;

    public Paciente(String nombrePaciente, double peso, int edad, Raza tipoRaza, String genero) {
        this.nombrePaciente = nombrePaciente;
        this.peso = peso;
        this.edad = edad;
        this.tipoRaza = tipoRaza;
        this.genero = genero;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws PesoNegativoException {
        if(peso < 0) {
            throw new PesoNegativoException(Mensaje.Paciente.PESO_NEGATIVO);
        }
        else {
            this.peso = peso;
        }

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws  EdadNegativaException {
        if(edad < 0) {
            throw new EdadNegativaException(Mensaje.Paciente.EDAD_NEGATIVA);
        }
        else {
            this.edad = edad;
        }
    }

    public Raza getTipoRaza() {
        return tipoRaza;
    }

    public void setTipoRaza(Raza tipoRaza) {
        this.tipoRaza = tipoRaza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
