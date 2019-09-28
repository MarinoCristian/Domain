package com.uco.edu.techvet.model.businessexception;

public class EdadNegativaException extends Exception {
    public EdadNegativaException(String mensaje) {
        super(mensaje);
    }
}
