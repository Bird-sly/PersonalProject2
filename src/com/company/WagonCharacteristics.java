package com.company;

public class WagonCharacteristics implements WagonProperties  {
    EngineType engineType;
    Doors noOfDoors;
    WDrive wDrive;
    GasType gasType;
    WagonType wagonType;



    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
    public void setWDrive(WDrive wheelDrive) {
        this.wDrive = wheelDrive;
    }
    public void setNoOfDoors(Doors noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
    public void setGasType(GasType gasType) {
        this.gasType = gasType;
    }
    public void setWagonType(WagonType wagonType) { this.wagonType = wagonType; }

    WagonCharacteristics(EngineType engineType, Doors noOfDoors, WDrive wheelDrive, GasType gasType, WagonType wagonType){

        setEngineType(engineType);
        setNoOfDoors(noOfDoors);
        setWDrive(wDrive);
        setGasType(gasType);
        setWagonType(wagonType);
    }
    @Override
    public String getEngineType() {
        return null;
    }
    @Override
    public String getWheelDrive() {
        return null;
    }
    @Override
    public String getGasType() {
        return null;
    }
    @Override
    public int getNoOfDoors() {
        return 0;
    }
    @Override
    public String getWagonType() { return null;}



}
