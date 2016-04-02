package com.mckay;

import com.mckay.builder.impl.BikeVehicleBuilder;
import com.mckay.builder.impl.CarVehicleBuilder;
import com.mckay.domain.Manufacturer;
import org.junit.*;


/**
 * Created by Jason McKay on 2016/03/29.
 */
public class TestTest
{
    Manufacturer manu;

    @Before
    public void setUp() throws Exception {
        manu = Manufacturer.getInstance();
    }


    @Test
    public void testSingletonCreateObject() throws Exception {

        manu.manufactureCar("diesel", "four");
        manu.getCar();
    }

    @Test
    public void testModifyObject() throws Exception {
        manu.manufactureCar("unleaded", "two");
        manu.modifyCar(1400, 4.2);
        manu.getCar();
    }
}
