package com.github.dpmorocho.obd.comandos.control;

import com.github.dpmorocho.obd.comandos.PercentageObdCommand;
import com.github.dpmorocho.obd.enums.AvailableCommandNames;

/**
 * Timing Advance
 */
public class TimingAdvanceCommand extends PercentageObdCommand {

    public TimingAdvanceCommand() {
        super("01 0E");
    }

    /**
     * @param other a {@link TimingAdvanceCommand} object.
     */
    public TimingAdvanceCommand(TimingAdvanceCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.TIMING_ADVANCE.getValue();
    }

}
