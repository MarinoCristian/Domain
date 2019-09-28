package com.uco.edu.techvet.model.businessexception;

public class PesoNegativoException extends Exception {
    public PesoNegativoException(String mensaje) {
        super(mensaje);
    }
}
