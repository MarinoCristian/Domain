package com.uco.edu.techvet.model;

import com.uco.edu.techvet.model.businessexception.EdadNegativaException;
import com.uco.edu.techvet.model.businessexception.PesoNegativoException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PacienteTest {
    Raza pitbull = new Raza();
    Paciente paciente = new Paciente("Zeus", 34.5, 12, pitbull, "Masculino");

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void edadNegativaException() throws EdadNegativaException {
        exception.expect(EdadNegativaException.class);
        exception.expectMessage(Mensaje.Paciente.EDAD_NEGATIVA);
        paciente.setEdad(-5);
    }

    @Test
    public void pesoNegativoException() throws PesoNegativoException {
        exception.expect(PesoNegativoException.class);
        exception.expectMessage(Mensaje.Paciente.PESO_NEGATIVO);
        paciente.setPeso(-5.8);
    }


}
