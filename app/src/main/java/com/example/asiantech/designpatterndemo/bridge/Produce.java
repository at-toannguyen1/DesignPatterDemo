package com.example.asiantech.designpatterndemo.bridge;

import android.util.Log;

/**
 * Created by toannguyent2 on 20/07/2017.
 */

public class Produce implements Workshop {
    @Override
    public void work() {
        Log.d("TTTTTT", "work: "+Produce.class.getSimpleName());
    }

    @Override
    public void doing() {
        Log.d("TTTTTT", "doing: "+Produce.class.getSimpleName());
    }
}
