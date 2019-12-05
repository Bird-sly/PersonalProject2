package com.company;

public enum WDrive {
    ALL_WHEEL_DRIVE("AWD"),
    FRONT_WHEEL_DRIVE("FWD"),
    REAR_WHEEL_DRIVE("RWD");
    private String code;
    WDrive(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
}