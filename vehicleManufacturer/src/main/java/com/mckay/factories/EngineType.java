package com.mckay.factories;

/**
 * Created by Jason McKay on 2016/03/28.
 */
public interface EngineType
{
    public abstract String fuelType();

    public abstract double getCapacity();

    public abstract void setCapacity(double capacity);

    public abstract double getOilInLiters();

    public abstract void setOilInLiters(double oilInLiters);

    public abstract String toString();
}
