package com.github.dpmorocho.obd.comandos.protocolo;

import com.github.dpmorocho.obd.comandos.PersistentCommand;
import com.github.dpmorocho.obd.enums.AvailableCommandNames;

/**
 * Retrieve available PIDs ranging from 21 to 40.
 */
public abstract class AvailablePidsCommand extends PersistentCommand {

    /**
     * Default ctor.
     */
    public AvailablePidsCommand(String command) {
        super(command);
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link AvailablePidsCommand} object.
     */
    public AvailablePidsCommand(AvailablePidsCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {

    }

    @Override
    public String getFormattedResult() {
        return getCalculatedResult();
    }

    @Override
    public String getCalculatedResult() {
        //First 4 characters are a copy of the command code, don't return those
        return String.valueOf(rawData).substring(4);
    }
}
