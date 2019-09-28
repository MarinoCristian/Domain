package com.uco.edu.techvet.model;

import java.util.ArrayList;
import java.util.List;

public class HistoriaClinica {
    public static int id = 1;
    private int idHistoria;
    private Paciente paciente;
    private Propietario propietario;
    private List<DetalleHistoriaClinica> detalleHistoriasClinicas = new ArrayList<>();

    public HistoriaClinica(Paciente paciente, Propietario propietario)
    {
        this.idHistoria = HistoriaClinica.id++;
        this.paciente = paciente;
        this.propietario = propietario;
    }

    public void consultarHistoriaClinica()
    {
       StringBuilder sb = new StringBuilder();
       sb.append("idHistoria").append(this.idHistoria).append("/n");
       sb.append("Paciente").append(this.paciente).append("/n");
       sb.append("Propietario").append(this.propietario).append("/n");
       for (DetalleHistoriaClinica detalle: detalleHistoriasClinicas) {
           sb.append("DetalleHistoriaClinica").append(this.detalleHistoriasClinicas).append("/n");
       }
       System.out.println(sb);
    }

    public void añadirDetalleHistoriaClinica(int idHistoria, DetalleHistoriaClinica detalleHistoriaClinica)
    {
        detalleHistoriasClinicas.add(detalleHistoriaClinica);
    }

    public void actualizarDetalledeHistoriaClinica(DetalleHistoriaClinica detalleHistoriaClinica, String nuevoDiagnostico, String nuevoFarmaco,String nuevaRecomendacion)
    {
        detalleHistoriaClinica.setDiagnostico(nuevoDiagnostico);
        detalleHistoriaClinica.setFarmacoRecetado(nuevoFarmaco);
        detalleHistoriaClinica.setRecomendacion(nuevaRecomendacion);
    }

    public int getIdHistoria() {
        return idHistoria;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public List<DetalleHistoriaClinica> getDetallesHistoriaClinica()
    {
        return detalleHistoriasClinicas;
    }
}
