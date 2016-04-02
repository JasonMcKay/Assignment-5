package com.mckay.chainOfResponsibility;

import com.mckay.chainOfResponsibility.DoorHandler;

/**
 * Created by Jason McKay on 2016/03/29.
 */
public class TwoDoorHandler extends DoorHandler {
    @Override
    public String handleRequest(String request) {
        if(request.equalsIgnoreCase("Two"))
        {
            return "Two door";
        }
        else
        {
            return successor.handleRequest(request);
        }
    }
}
