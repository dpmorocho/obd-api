package com.github.dpmorocho.obd.comandos.protocolo;

/**
 * Warm-start the OBD connection.
 */
public class ObdWarmstartCommand extends ObdProtocolCommand {

    public ObdWarmstartCommand() {
        super("AT WS");
    }

    /**
     * @param other a {@link ObdWarmstartCommand} object.
     */
    public ObdWarmstartCommand(ObdWarmstartCommand other) {
        super(other);
    }

    @Override
    public String getFormattedResult() {
        return getResult();
    }

    @Override
    public String getName() {
        return "Warmstart OBD";
    }

}
