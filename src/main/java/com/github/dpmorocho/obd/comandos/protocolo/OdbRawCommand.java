package com.github.dpmorocho.obd.comandos.protocolo;

/**
 * This class allows for an unspecified command to be sent.
 */
public class OdbRawCommand extends ObdProtocolCommand {

    /**
     * @param command a {@link java.lang.String} object.
     */
    public OdbRawCommand(String command) {
        super(command);
    }

    @Override
    public String getFormattedResult() {
        return getResult();
    }

    @Override
    public String getName() {
        return "Custom command " + getName();
    }

}
