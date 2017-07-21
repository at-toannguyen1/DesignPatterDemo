package com.example.asiantech.designpatterndemo.bridge;

import android.util.Log;

/**
 * Created by toannguyent2 on 20/07/2017.
 */

public class Bike extends Vehicle {
    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        Log.d("TTTTTT", "manufacture: Bike");
        workshop1.work();
        workshop2.work();
    }
}
