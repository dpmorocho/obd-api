package com.github.dpmorocho.obd.excepciones;

/**
 * Thrown when there is a "?" message.
 */
public class MisunderstoodCommandException extends ResponseException {

    public MisunderstoodCommandException() {
        super("?");
    }

}
