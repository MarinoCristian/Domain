package com.uco.edu.techvet.model.parametro;

public enum TipoPersonaEnum {
    PERSONA(1,"Propietario"),
    MEDICO(2,"Medico");

    private int id;
    private String tipoPersona;

    TipoPersonaEnum(int id, String tipoPersona)
    {
        this.id = id;
        this.tipoPersona = tipoPersona;
    }

    public int getId() {
        return id;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
}
