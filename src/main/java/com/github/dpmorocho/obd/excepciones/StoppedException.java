package com.github.dpmorocho.obd.excepciones;

/**
 * Sent when there is a "STOPPED" message.
 */
public class StoppedException extends ResponseException {

    public StoppedException() {
        super("DETENIDO");
    }

}
