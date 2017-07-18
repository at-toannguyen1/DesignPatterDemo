package com.example.asiantech.designpatterndemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.asiantech.designpatterndemo.bridge.BridgePatternActivity;
import com.example.asiantech.designpatterndemo.mediator.MediatorActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mBtnBridge;
    private Button mBtnMediator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnBridge = (Button) findViewById(R.id.btnBridge);
        mBtnMediator = (Button) findViewById(R.id.btnMediator);
        mBtnBridge.setOnClickListener(this);
        mBtnMediator.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnBridge:
                startActivity(new Intent(this, BridgePatternActivity.class));
                break;
            case R.id.btnMediator:
                startActivity(new Intent(this, MediatorActivity.class));
                break;
        }
    }
}
