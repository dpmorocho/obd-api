package com.github.dpmorocho.obd.excepciones;

/**
 * Thrown when there is a "UNABLE TO CONNECT" message.
 */
public class UnableToConnectException extends ResponseException {

    public UnableToConnectException() {
        super("IMPOSIBLE CONECTAR");
    }

}
