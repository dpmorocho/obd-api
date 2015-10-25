package com.github.dpmorocho.obd.excepciones;

/**
 * Thrown when there is a "BUS INIT... ERROR" message
 */
public class BusInitException extends ResponseException {

    public BusInitException() {
        super("ERROR EN BUS DE DATOS");
    }

}
