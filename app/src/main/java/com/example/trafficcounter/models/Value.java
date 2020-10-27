package com.example.trafficcounter.models;

public class Value {
    private int w2value;
    private int w3value;
    private int w4stdvalue;
    private int w4truckvalue;
    private int w6value;
    private int axle4value;
    private int totalValue;
    private int lightVehicle;
    private int heavyVehicle;
    public Value(){
    }

    public Value(int w2value, int w3value, int w4stdvalue, int w4truckvalue, int w6value, int axle4value, int totalValue, int lightVehicle, int heavyVehicle) {
        this.w2value = w2value;
        this.w3value = w3value;
        this.w4stdvalue = w4stdvalue;
        this.w4truckvalue = w4truckvalue;
        this.w6value = w6value;
        this.axle4value = axle4value;
        this.totalValue = totalValue;
        this.lightVehicle = lightVehicle;
        this.heavyVehicle = heavyVehicle;

    }

    public int getW2value() {
        return w2value;
    }

    public void setW2value(int w2value) {
        this.w2value = w2value;
    }

    public int getW3value() {
        return w3value;
    }

    public void setW3value(int w3value) {
        this.w3value = w3value;
    }

    public int getW4stdvalue() {
        return w4stdvalue;
    }

    public void setW4stdvalue(int w4stdvalue) {
        this.w4stdvalue = w4stdvalue;
    }

    public int getW4truckvalue() {
        return w4truckvalue;
    }

    public void setW4truckvalue(int w4truckvalue) {
        this.w4truckvalue = w4truckvalue;
    }

    public int getW6value() {
        return w6value;
    }

    public void setW6value(int w6value) {
        this.w6value = w6value;
    }

    public int getAxle4value() {
        return axle4value;
    }

    public void setAxle4value(int axle4value) {
        this.axle4value = axle4value;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public int getLightVehicle() {
        return lightVehicle;
    }

    public void setLightVehicle(int lightVehicle) {
        this.lightVehicle = lightVehicle;
    }

    public int getHeavyVehicle() {
        return heavyVehicle;
    }

    public void setHeavyVehicle(int heavyVehicle) {
        this.heavyVehicle = heavyVehicle;
    }
}
