package com.github.dpmorocho.obd.excepciones;

/**
 * Thrown when there is a "?" message.
 */
public class UnsupportedCommandException extends ResponseException {

    public UnsupportedCommandException() {
        super("7F 0[0-9] 12", true);
    }

}
