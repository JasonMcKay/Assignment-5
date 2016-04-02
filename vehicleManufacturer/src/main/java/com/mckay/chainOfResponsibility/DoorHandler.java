package com.mckay.chainOfResponsibility;

/**
 * Created by Jason McKay on 2016/03/29.
 */
public abstract class DoorHandler {
    DoorHandler successor;

    public void setSuccessor(DoorHandler successor)
    {
        this.successor = successor;
    }

    public abstract String handleRequest(String request);
}
