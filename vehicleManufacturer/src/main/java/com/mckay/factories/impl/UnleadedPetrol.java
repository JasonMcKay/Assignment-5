package com.mckay.factories.impl;

import com.mckay.factories.EngineType;

/**
 * Created by Jason McKay on 2016/03/29.
 */
public class UnleadedPetrol implements EngineType
{
    private String fuelType;
    private double capacity = 1200;
    private double oilInLiters = 1.6;

    public void setFuelType(String fuelType)
    {
        this.fuelType = fuelType;
    }

    public String fuelType() {
        return "Unleaded petrol";
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getOilInLiters() {
        return oilInLiters;
    }

    public void setOilInLiters(double oilInLiters) {
        this.oilInLiters = oilInLiters;
    }

    public String toString()
    {
        return "Engine:"+"\nSize(cc): "+capacity+"\nLiters: "+oilInLiters;
    }
}
