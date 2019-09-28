package com.uco.edu.techvet.model;

public class Raza {
    private String tipoRaza;
    private TipoAnimal tipoAnimal;

    public Raza(String tipoRaza, TipoAnimal tipoAnimal) {
        this.tipoRaza = tipoRaza;
        this.tipoAnimal = tipoAnimal;
    }

    public String getTipoRaza() {
        return tipoRaza;
    }

    public void setTipoRaza(String tipoRaza) {
        this.tipoRaza = tipoRaza;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
