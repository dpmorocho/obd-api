package com.github.dpmorocho.obd.comandos.presion;

import com.github.dpmorocho.obd.enums.AvailableCommandNames;

public class FuelPressureCommand extends PressureCommand {

    public FuelPressureCommand() {
        super("010A");
    }

    /**
     * @param other a {@link FuelPressureCommand} object.
     */
    public FuelPressureCommand(FuelPressureCommand other) {
        super(other);
    }

    /**
     * {@inheritDoc}
     * <p>
     * TODO describe of why we multiply by 3
     */
    @Override
    protected final int preparePressureValue() {
        return buffer.get(2) * 3;
    }

    @Override
    public String getName() {
        return AvailableCommandNames.FUEL_PRESSURE.getValue();
    }

}
