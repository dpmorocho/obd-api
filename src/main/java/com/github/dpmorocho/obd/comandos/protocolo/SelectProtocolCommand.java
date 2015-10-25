package com.github.dpmorocho.obd.comandos.protocolo;

import com.github.dpmorocho.obd.enums.ObdProtocols;

/**
 * Select the protocol to use.
 */
public class SelectProtocolCommand extends ObdProtocolCommand {

    private final ObdProtocols protocol;

    /**
     * @param protocol a {@link com.github.dpmorocho.obd.enums.ObdProtocols} object.
     */
    public SelectProtocolCommand(final ObdProtocols protocol) {
        super("AT SP " + protocol.getValue());
        this.protocol = protocol;
    }

    @Override
    public String getFormattedResult() {
        return getResult();
    }

    @Override
    public String getName() {
        return "Protocolo " + protocol.name();
    }

}
