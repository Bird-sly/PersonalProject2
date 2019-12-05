package com.company;

public abstract class Vehicle implements CarProperties{

    int year;
    String make;
    String model;
    VehicleType type;
    Color color;
    Vehicle(int year, String make, String model, VehicleType type,Color color){
        this.year = year;
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;

    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
    @Override
    public String toString()
    {
        return("This car is a "+type + "\n It was made by " + make +"\n Its model is " + model +".\n It was build and made in  " +year +"\n The color of the car is " + color);
    }
}