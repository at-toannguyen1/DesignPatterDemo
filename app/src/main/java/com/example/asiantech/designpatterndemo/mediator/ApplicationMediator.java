package com.example.asiantech.designpatterndemo.mediator;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by toannguyent2 on 21/07/2017.
 */

public class ApplicationMediator implements Mediator {
    private List<User> users;

    public ApplicationMediator() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
