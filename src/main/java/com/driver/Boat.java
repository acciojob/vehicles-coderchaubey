package com.driver;

public class Boat implements WaterVehicle{
    @Override
    public String getVehicleName() {
        return "Toyota";
    }

    @Override
    public int getVehicleCapacity() {
        return 6;
    }
}
