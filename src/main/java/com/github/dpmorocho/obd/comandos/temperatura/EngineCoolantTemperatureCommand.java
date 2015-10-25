package com.github.dpmorocho.obd.comandos.temperatura;

import com.github.dpmorocho.obd.enums.AvailableCommandNames;

/**
 * Engine Coolant Temperature.
 */
public class EngineCoolantTemperatureCommand extends TemperatureCommand {

    /**
     *
     */
    public EngineCoolantTemperatureCommand() {
        super("01 05");
    }

    /**
     * @param other a {@link TemperatureCommand} object.
     */
    public EngineCoolantTemperatureCommand(TemperatureCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.ENGINE_COOLANT_TEMP.getValue();
    }

}
