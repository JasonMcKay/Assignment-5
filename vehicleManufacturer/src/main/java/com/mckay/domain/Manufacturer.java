package com.mckay.domain;

import com.mckay.builder.impl.BikeVehicleBuilder;
import com.mckay.builder.impl.CarVehicleBuilder;

/**
 * Created by Jason McKay on 2016/03/29.
 */
public class Manufacturer
{
    private static Manufacturer manufacturer = null;
    private CarVehicleBuilder car;
    private BikeVehicleBuilder bike;

    private Manufacturer() {
    }

    public static Manufacturer getInstance()
    {
        if(manufacturer == null)
        {
            manufacturer = new Manufacturer();
        }
        return manufacturer;
    }

    public CarVehicleBuilder manufactureCar(String engineType, String doorType)
    {
        car = new CarVehicleBuilder();
        car.buildEngine(engineType);
        car.buildDoors(doorType);
        return car;
    }

    public void modifyCar(double capacity, double liters)
    {
        car.modifyEngine(capacity, liters);
    }

    public BikeVehicleBuilder manufactureBike(String engineType, String doorType)
    {
        bike = new BikeVehicleBuilder();
        bike.buildEngine(engineType);
        bike.buildDoors(doorType);
        return bike;
    }

    public void modifyBike(double capacity, double liters)
    {
        bike.modifyEngine(capacity, liters);
    }

    public void getCar()
    {
        car.getVehicle();
    }

    public void getBike()
    {
        bike.getVehicle();
    }
}
