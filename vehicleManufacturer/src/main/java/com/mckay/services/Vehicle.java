package com.mckay.services;

import com.mckay.chainOfResponsibility.DoorHandler;
//import com.mckay.domain.EngineFactory;
import com.mckay.chainOfResponsibility.FourDoorHandler;
import com.mckay.chainOfResponsibility.NoDoorHandler;
import com.mckay.chainOfResponsibility.TwoDoorHandler;
import com.mckay.factories.EngineType;

/**
 * Created by Jason McKay on 2016/03/29.
 */
public class Vehicle
{
    private EngineType engine;
    private DoorHandler doors1 = new FourDoorHandler();
    private DoorHandler doors2 = new TwoDoorHandler();
    private DoorHandler doors3 = new NoDoorHandler();
    private String doors;

    public EngineType getEngine() {
        return engine;
    }

    public void setEngine(EngineType engine) {
        this.engine = engine;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doorType) {
        doors1.setSuccessor(doors2);
        doors2.setSuccessor(doors3);

        this.doors = doors1.handleRequest(doorType);
    }

    public String toString()
    {
        return "vehicle built!!!!\n" + engine.toString() +"\nFuel type: " + engine.fuelType() + "\nDoors: " + doors;
    }
}
