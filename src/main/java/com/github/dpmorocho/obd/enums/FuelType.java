package com.github.dpmorocho.obd.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * MODE 1 PID 0x51 will return one of the following values to identify the fuel
 * type of the vehicle.
 */
public enum FuelType {
	GASOLINE(0x01, "Gasolina"),
    METHANOL(0x02, "Metanol"),
    ETHANOL(0x03, "Etanol"),
    DIESEL(0x04, "Diesel"),
    LPG(0x05, "GPL/LGP"),
    CNG(0x06, "Gas Natural"),
    PROPANE(0x07, "Propano"),
    ELECTRIC(0x08, "Eléctrico"),
    BIFUEL_GASOLINE(0x09, "Biodiesel + Gasolina"),
    BIFUEL_METHANOL(0x0A, "Biodiesel + Metanol"),
    BIFUEL_ETHANOL(0x0B, "Biodiesel + Etanol"),
    BIFUEL_LPG(0x0C, "Biodiesel + GPL/LGP"),
    BIFUEL_CNG(0x0D, "Biodiesel + Gas Natural"),
    BIFUEL_PROPANE(0x0E, "Biodiesel + Propano"),
    BIFUEL_ELECTRIC(0x0F, "Biodiesel + Eléctrico"),
    BIFUEL_GASOLINE_ELECTRIC(0x10, "Biodiesel + Gasolina/Eléctrico"),
    HYBRID_GASOLINE(0x11, "Gasolina híbrida"),
    HYBRID_ETHANOL(0x12, "Etanol híbrido"),
    HYBRID_DIESEL(0x13, "Diesel híbrido"),
    HYBRID_ELECTRIC(0x14, "Eléctrico híbrido"),
    HYBRID_MIXED(0x15, "Híbrido mezclado"),
    HYBRID_REGENERATIVE(0x16, "Híbrido regenerativo");

    private static Map<Integer, FuelType> map = new HashMap<Integer, FuelType>();

    static {
        for (FuelType error : FuelType.values())
            map.put(error.getValue(), error);
    }

    private final int value;
    private final String description;

    private FuelType(final int value, final String description) {
        this.value = value;
        this.description = description;
    }

    /**
     * <p>fromValue.</p>
     *
     * @param value a int.
     * @return a {@link com.github.dpmorocho.obd.enums.FuelType} object.
     */
    public static FuelType fromValue(final int value) {
        return map.get(value);
    }

    /**
     * <p>Getter for the field <code>value</code>.</p>
     *
     * @return a int.
     */
    public int getValue() {
        return value;
    }

    /**
     * <p>Getter for the field <code>description</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDescription() {
        return description;
    }

}
