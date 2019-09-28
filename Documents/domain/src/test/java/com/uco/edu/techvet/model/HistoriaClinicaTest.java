package com.uco.edu.techvet.model;

import com.uco.edu.techvet.model.parametro.TipoPersonaEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HistoriaClinicaTest {

    @Test
    public void seAgreganDetallesAHistoria() {
        Medico juan = new Medico("Juan","123134",TipoPersonaEnum.MEDICO);
        TipoAnimal tipoAnimal = new TipoAnimal("canino");
        Raza pitbull = new Raza("pitbull",tipoAnimal);
        Date fecha = new Date(2009,12,31);
        Paciente Zeus = new Paciente("Zeus",54.4, 12, pitbull,"Masculino");
        Propietario persona = new Propietario("Pedro",1245,43,12345,"@hot",TipoPersonaEnum.PERSONA);
        DetalleHistoriaClinica detalleHistoriaClinica1 = new DetalleHistoriaClinica(juan, fecha,"Gastritis", "Reposo", "Vitacem");
        HistoriaClinica historia1 = new HistoriaClinica(Zeus,persona);
        historia1.añadirDetalleHistoriaClinica(1,detalleHistoriaClinica1);
        boolean validacion = historia1.getDetallesHistoriaClinica().isEmpty();
        Assert.assertFalse(validacion);
    }

    @Test
    public void ConsultarHistoriaClinica(){
        Paciente Zeus = new Paciente("Zeus",54.4, 12, pitbull,"Masculino");
        Propietario persona = new Propietario("Pedro",1245,43,12345,"@hot",TipoPersonaEnum.PERSONA);
        HistoriaClinica historia1 = new HistoriaClinica(Zeus, persona);
        historia1.consultarHistoriaClinica();
    }

    @Test
    public void ActualizarHistoriaClinica(){
        Paciente Zeus = new Paciente("Zeus",54.4, 12, pitbull,"Masculino");
        Propietario persona = new Propietario("Pedro",1245,43,12345,"@hot",TipoPersonaEnum.PERSONA);
        Medico juan = new Medico("Juan","123134",TipoPersonaEnum.MEDICO);
        TipoAnimal tipoAnimal = new TipoAnimal("canino");
        Raza pitbull = new Raza("pitbull",tipoAnimal);
        Date fecha = new Date(2009,12,31);
        DetalleHistoriaClinica detalleHistoriaClinica1 = new DetalleHistoriaClinica(juan, fecha,"Gastritis", "Reposo", "Vitacem");
        HistoriaClinica historia1 = new HistoriaClinica(Zeus, persona);
        historia1.actualizarDetalledeHistoriaClinica(detalleHistoriaClinica1, "Anemia","Aminomix", "Beber mucha agua");
        boolean validacion = historia1.getDetallesHistoriaClinica().isEmpty();
        Assert.assertFalse(validacion);
    }


}
