package com.example.asiantech.designpatterndemo.mediator;

import android.util.Log;

/**
 * JTPoorman
 *
 * @author at-ToanNguyen
 */

public class JTPoorman extends Colleague {
    public JTPoorman(Mediator mediator, int colleagueCode) {
        super(mediator, colleagueCode);
        Log.d("GGGGGGG", "JT Poorman signed up with the stockexchange \n");
    }
}
