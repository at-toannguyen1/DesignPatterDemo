package com.example.asiantech.designpatterndemo.bridge;

import android.util.Log;

/**
 * Created by toannguyent2 on 20/07/2017.
 */

public class Car extends Vehicle {

    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        Log.d("TTTTT", "manufacture: Car");
        workshop2.work();
        workshop1.doing();
    }
}
