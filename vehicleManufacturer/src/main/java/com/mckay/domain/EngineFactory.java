package com.mckay.domain;

import com.mckay.factories.EngineType;
import com.mckay.factories.impl.Diesel;
import com.mckay.factories.impl.LeadedPetrol;
import com.mckay.factories.impl.UnleadedPetrol;

/**
 * Created by Jason McKay on 2016/03/29.
 */
public class EngineFactory
{
    private static EngineFactory engineFactory = null;

    public EngineFactory() {
    }

    public static EngineFactory getEngineFactoryInstance()
    {
        if(engineFactory == null)
        {
            return new EngineFactory();
        }
        return engineFactory;
    }

    public EngineType getEngineType(String fuelType)
    {
        if(fuelType.equalsIgnoreCase("Diesel"))
        {
            return new Diesel();
        }
        else if(fuelType.equalsIgnoreCase("Unleaded"))
        {
            return new UnleadedPetrol();
        }
        else
        {
            return new LeadedPetrol();
        }
    }
}
