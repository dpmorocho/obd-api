package com.github.dpmorocho.obd.comandos.protocolo;

import com.github.dpmorocho.obd.comandos.ObdCommand;

/**
 * Reset trouble codes.
 */
public class ResetTroubleCodesCommand extends ObdCommand {

    public ResetTroubleCodesCommand() {
        super("04");
    }

    @Override
    protected void performCalculations() {

    }

    @Override
    public String getFormattedResult() {
        return getResult();
    }

    @Override
    public String getCalculatedResult() {
        return getResult();
    }


    @Override
    public String getName() {
        return getResult();
    }

}
