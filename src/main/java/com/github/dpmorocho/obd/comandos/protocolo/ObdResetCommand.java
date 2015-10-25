package com.github.dpmorocho.obd.comandos.protocolo;

/**
 * Reset the OBD connection.
 */
public class ObdResetCommand extends ObdProtocolCommand {

    public ObdResetCommand() {
        super("AT Z");
    }

    /**
     * @param other a {@link com.github.dpmorocho.obd.comandos.protocolo.ObdResetCommand} object.
     */
    public ObdResetCommand(ObdResetCommand other) {
        super(other);
    }

    @Override
    public String getFormattedResult() {
        return getResult();
    }

    @Override
    public String getName() {
        return "Reset OBD";
    }

}
