package com.example.asiantech.designpatterndemo.bridge;

/**
 * Created by toannguyent2 on 20/07/2017.
 */

public abstract class Vehicle {
    protected Workshop workshop1;
    protected Workshop workshop2;

    public Vehicle(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    abstract public void manufacture();
}
