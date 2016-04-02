package com.mckay.chainOfResponsibility;

import com.mckay.chainOfResponsibility.DoorHandler;

/**
 * Created by Jason McKay on 2016/03/29.
 */
public class NoDoorHandler extends DoorHandler {
    @Override
    public String handleRequest(String request) {
        if(request.equalsIgnoreCase("No"))
        {
            return "No doors";
        }
        else
        {
            return successor.handleRequest(request);
        }
    }
}
