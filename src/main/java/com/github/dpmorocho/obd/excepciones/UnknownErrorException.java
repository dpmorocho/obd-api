package com.github.dpmorocho.obd.excepciones;

/**
 * Thrown when there is "ERROR" in the response
 */
public class UnknownErrorException extends ResponseException {

    public UnknownErrorException() {
        super("ERROR");
    }

}
