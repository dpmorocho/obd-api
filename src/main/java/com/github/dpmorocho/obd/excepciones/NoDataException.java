package com.github.dpmorocho.obd.excepciones;

/**
 * Thrown when there is a "NO DATA" message.
 */
public class NoDataException extends ResponseException {

    public NoDataException() {
        super("SIN DATOS");
    }

}
