package com.mckay.builder.impl;

import com.mckay.builder.VehicleBuilder;
import com.mckay.domain.EngineFactory;
import com.mckay.factories.EngineType;
import com.mckay.services.Vehicle;

/**
 * Created by Jason McKay on 2016/03/29.
 */
public class BikeVehicleBuilder implements VehicleBuilder
{
    private Vehicle vehicle;
    private EngineFactory engine;
    private EngineType engineType;

    public BikeVehicleBuilder() {
        vehicle = new Vehicle();
        engine = EngineFactory.getEngineFactoryInstance();
    }

    public void buildEngine(String fuelType) {
        engineType = engine.getEngineType(fuelType);
        vehicle.setEngine(engineType);
    }

    public void modifyEngine(double capacity, double liters)
    {
        engineType.setCapacity(capacity);
        engineType.setOilInLiters(liters);
    }

    public void buildDoors(String doorType) {
        vehicle.setDoors("no");
    }

    public Vehicle getVehicle() {
        System.out.println(vehicle.toString());
        return vehicle;
    }
}
