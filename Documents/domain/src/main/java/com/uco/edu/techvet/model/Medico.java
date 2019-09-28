package com.uco.edu.techvet.model;

import com.uco.edu.techvet.model.parametro.TipoPersonaEnum;

public class Medico {
    private String nombreMedico;
    private String identificacion;
    private TipoPersonaEnum tipoPersona;

    public Medico(String nombreMedico, String identificacion, TipoPersonaEnum tipoPersona) {
        this.nombreMedico = nombreMedico;
        this.identificacion = identificacion;
        this.tipoPersona = tipoPersona;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public TipoPersonaEnum getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersonaEnum tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
}
