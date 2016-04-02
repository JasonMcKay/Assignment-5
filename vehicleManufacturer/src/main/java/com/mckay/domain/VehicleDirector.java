package com.mckay.domain;

import com.mckay.builder.VehicleBuilder;
import com.mckay.services.Vehicle;

/**
 * Created by Jason McKay on 2016/03/29.
 */
public class VehicleDirector
{
    private VehicleBuilder vehicleBuilder = null;

    public VehicleDirector(VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
    }

    public void constructVehicle(String fuelType, String doorType)
    {
        vehicleBuilder.buildEngine(fuelType);
        vehicleBuilder.buildDoors(doorType);
    }

    public Vehicle getVehicle()
    {
        return vehicleBuilder.getVehicle();
    }
}
