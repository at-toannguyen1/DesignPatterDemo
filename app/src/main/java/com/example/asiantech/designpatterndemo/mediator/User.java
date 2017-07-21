package com.example.asiantech.designpatterndemo.mediator;

/**
 * Created by toannguyent2 on 21/07/2017.
 */

public abstract class User {
    protected Mediator mediator;
    protected String name;

    public User(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    public abstract void receive(String msg);
    public abstract void send(String msg);
}
