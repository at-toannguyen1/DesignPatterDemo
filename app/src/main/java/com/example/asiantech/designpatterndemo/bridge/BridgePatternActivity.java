package com.example.asiantech.designpatterndemo.bridge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.asiantech.designpatterndemo.R;


public class BridgePatternActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge_pattern);
        Vehicle vehicle=new Car(new Produce(),new Assemble());
        Vehicle vehicle1=new Bike(new Produce(),new Assemble());
        vehicle.manufacture();
        vehicle1.manufacture();
    }

}
