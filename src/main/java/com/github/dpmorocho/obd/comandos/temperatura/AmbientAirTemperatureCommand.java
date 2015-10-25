package com.github.dpmorocho.obd.comandos.temperatura;

import com.github.dpmorocho.obd.enums.AvailableCommandNames;

/**
 * Ambient Air Temperature.
 */
public class AmbientAirTemperatureCommand extends TemperatureCommand {

    /**
     */
    public AmbientAirTemperatureCommand() {
        super("01 46");
    }

    /**
     * @param other a {@link TemperatureCommand} object.
     */
    public AmbientAirTemperatureCommand(TemperatureCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.AMBIENT_AIR_TEMP.getValue();
    }

}
