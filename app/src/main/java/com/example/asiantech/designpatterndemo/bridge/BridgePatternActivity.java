package com.example.asiantech.designpatterndemo.bridge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.asiantech.designpatterndemo.R;

public class BridgePatternActivity extends AppCompatActivity implements View.OnClickListener {
    RemoteButton theTV = new TVRemoteOne(new TVDevice(1, 200));
    RemoteButton theTV2 = new TVRemoteTwo(new TVDevice(1, 200));
    private TextView mTvTelevision;
    private TextView mTvNextChannel;
    private TextView mTvPreviousChannel;
    private TextView mTvNextChannel2;
    private TextView mTvPreviousChannel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge_pattern);
        mTvTelevision = (TextView) findViewById(R.id.tvTV);
        mTvNextChannel = (TextView) findViewById(R.id.tvNextChannel);
        mTvPreviousChannel = (TextView) findViewById(R.id.tvPreviousChannel);
        mTvNextChannel2 = (TextView) findViewById(R.id.tvNextChannel2);
        mTvPreviousChannel2 = (TextView) findViewById(R.id.tvPreviousChannel2);

        mTvNextChannel.setOnClickListener(this);
        mTvPreviousChannel.setOnClickListener(this);
        mTvNextChannel2.setOnClickListener(this);
        mTvPreviousChannel2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tvNextChannel:
                theTV.buttonSixPressed();
                mTvTelevision.setText(theTV.deviceFeedback());
                break;
            case R.id.tvPreviousChannel:
                theTV.buttonFivePressed();
                mTvTelevision.setText(theTV.deviceFeedback());
                break;
            case R.id.tvNextChannel2:
                theTV2.buttonSixPressed();
                mTvTelevision.setText(theTV2.deviceFeedback());
                break;
            case R.id.tvPreviousChannel2:
                theTV2.buttonFivePressed();
                mTvTelevision.setText(theTV2.deviceFeedback());
                break;
        }
    }
}
