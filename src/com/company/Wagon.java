package com.company;
import java.sql.SQLOutput;

public class Wagon extends Vehicle {
    WagonCharacteristics wagonCharacteristics;
    Wagon(int year, String make, String model, Color color, WagonCharacteristics wagonCharacteristics) {
        super(year, make, model, VehicleType.WAGON, color);
        //this.WagonCharacteristics = WagonCharacteristics;

    }

    @Override
    public String getVType() {
        return null;
    }
}
