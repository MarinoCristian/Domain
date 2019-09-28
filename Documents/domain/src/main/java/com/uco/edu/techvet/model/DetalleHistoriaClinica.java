package com.uco.edu.techvet.model;

import java.util.Date;

public class DetalleHistoriaClinica {
    public static int idc = 1;
    private int id;
    private Medico medico;
    private Date fecha;
    private String diagnostico;
    private String recomendacion;
    private String farmacoRecetado;
    //descripcion del proceso y no 2 tipos diagnotisco,,, poner reomendaciones como atributo string
    //que se le pueda asignar n hc a un apciente
    //calcular edad de animal y no negativa

    public DetalleHistoriaClinica(Medico medico, Date fecha, String diagnostico, String recomendacion, String farmacoRecetado) {
        this.id = DetalleHistoriaClinica.idc++;
        this.medico = medico;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.recomendacion = recomendacion;
        this.farmacoRecetado = farmacoRecetado;
    }

    public int getId() {
        return id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public String getFarmacoRecetado() {
        return farmacoRecetado;
    }

    public void setFarmacoRecetado(String farmacoRecetado) {
        this.farmacoRecetado = farmacoRecetado;
    }
}
