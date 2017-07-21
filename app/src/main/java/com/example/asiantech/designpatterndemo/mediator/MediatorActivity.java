package com.example.asiantech.designpatterndemo.mediator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.asiantech.designpatterndemo.R;

public class MediatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator);
        ApplicationMediator mediator = new ApplicationMediator();
        User user1=new UserImpl(mediator,"Tony");
        User user2=new UserImpl(mediator,"Sam");
        User user3=new UserImpl(mediator,"Nick");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        user1.send("Hello everyone");
    }
}
