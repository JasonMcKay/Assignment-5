package com.mckay.builder;

import com.mckay.services.Vehicle;

/**
 * Created by Jason McKay on 2016/03/28.
 */
public interface VehicleBuilder
{
    public void buildEngine(String fuelType);
    public void buildDoors(String doorType);
    public void modifyEngine(double capacity, double liters);
    public Vehicle getVehicle();
}
