package com.jagex;

public enum BuildType {

    LIVE("LIVE", 0),
    RC("RC", 1),
    WIP("WIP", 2),
    BLIVE("BUILDLIVE", 3);

    public final String name;
    public final int id;


    BuildType(String var1, int var2) {
        this.name = var1;
        this.id = -1466758291 * var2;
    }

}
