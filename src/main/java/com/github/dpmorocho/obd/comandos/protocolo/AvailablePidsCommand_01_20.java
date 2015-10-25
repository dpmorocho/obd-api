package com.github.dpmorocho.obd.comandos.protocolo;

import com.github.dpmorocho.obd.comandos.PersistentCommand;
import com.github.dpmorocho.obd.enums.AvailableCommandNames;

/**
 * Retrieve available PIDs ranging from 01 to 20.
 */
public class AvailablePidsCommand_01_20 extends AvailablePidsCommand {

    /**
     * Default ctor.
     */
    public AvailablePidsCommand_01_20() {
        super("01 00");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link AvailablePidsCommand} object.
     */
    public AvailablePidsCommand_01_20(AvailablePidsCommand_01_20 other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.PIDS_01_20.getValue();
    }
}
