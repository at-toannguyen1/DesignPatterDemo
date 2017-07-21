package com.example.asiantech.designpatterndemo.mediator;

import android.util.Log;

/**
 * Created by toannguyent2 on 21/07/2017.
 */

public class UserImpl extends User {

    public UserImpl(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String msg) {
        Log.d("TTTTTT", name + " Receive: "+ msg);
    }

    @Override
    public void send(String msg) {
        Log.d("TTTTTT", name + " Send: "+ msg);
        mediator.sendMessage(msg,this);
    }
}
