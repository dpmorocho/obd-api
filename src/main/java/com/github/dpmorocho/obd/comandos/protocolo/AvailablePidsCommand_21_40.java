package com.github.dpmorocho.obd.comandos.protocolo;

import com.github.dpmorocho.obd.comandos.PersistentCommand;
import com.github.dpmorocho.obd.enums.AvailableCommandNames;

/**
 * Retrieve available PIDs ranging from 21 to 40.
 */
public class AvailablePidsCommand_21_40 extends AvailablePidsCommand {

    /**
     * Default ctor.
     */
    public AvailablePidsCommand_21_40() {
        super("01 20");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link AvailablePidsCommand} object.
     */
    public AvailablePidsCommand_21_40(AvailablePidsCommand_21_40 other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.PIDS_21_40.getValue();
    }
}
