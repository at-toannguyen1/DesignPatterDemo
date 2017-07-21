package com.example.asiantech.designpatterndemo.mediator;

/**
 * Created by toannguyent2 on 21/07/2017.
 */

public interface Mediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
