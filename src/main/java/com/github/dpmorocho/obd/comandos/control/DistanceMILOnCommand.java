package com.github.dpmorocho.obd.comandos.control;

import com.github.dpmorocho.obd.comandos.ObdCommand;
import com.github.dpmorocho.obd.comandos.SystemOfUnits;
import com.github.dpmorocho.obd.enums.AvailableCommandNames;

public class DistanceMILOnCommand extends ObdCommand
        implements SystemOfUnits {

    private int km = 0;

    /**
     * Default ctor.
     */
    public DistanceMILOnCommand() {
        super("01 21");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link DistanceMILOnCommand} object.
     */
    public DistanceMILOnCommand(
            DistanceMILOnCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 31] of the response
        km = buffer.get(2) * 256 + buffer.get(3);
    }

    public String getFormattedResult() {
        return useImperialUnits ? String.format("%.2f%s", getImperialUnit(), getResultUnit())
                : String.format("%d%s", km, getResultUnit());
    }

    @Override
    public String getCalculatedResult() {
        return useImperialUnits ? String.valueOf(getImperialUnit()) : String.valueOf(km);
    }

    @Override
    public String getResultUnit() {
        return useImperialUnits ? "m" : "km";
    }

    @Override
    public float getImperialUnit() {
        return Double.valueOf(km * 0.621371192).floatValue();
    }

    /**
     * @return a int.
     */
    public int getKm() {
        return km;
    }

    @Override
    public String getName() {
        return AvailableCommandNames.DISTANCE_TRAVELED_MIL_ON
                .getValue();
    }

}
