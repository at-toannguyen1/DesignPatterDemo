package com.example.asiantech.designpatterndemo.mediator;

import android.util.Log;

/**
 * GormanSlacks
 *
 * @author at-ToanNguyen
 */

class GormanSlacks extends Colleague {

    GormanSlacks(Mediator mediator, int colleagueCode) {
        super(mediator, colleagueCode);
        Log.d("GGGGGGG", "Gorman Slacks signed up with the stockexchange \n");
    }


}
