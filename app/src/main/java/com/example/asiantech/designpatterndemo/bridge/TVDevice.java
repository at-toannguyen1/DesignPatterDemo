package com.example.asiantech.designpatterndemo.bridge;

import android.util.Log;

/**
 * TVDeivce
 *
 * @author at-ToanNguyen
 */

class TVDevice extends EntertainmentDevice {
    TVDevice(int newDeviceState, int newMaxSetting) {
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    @Override
    public void buttonFivePressed() {
        Log.d("TTTTT", "buttonFivePressed: Channel Down");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        Log.d("TTTTT", "buttonSixPressed: Channel Up");
        deviceState++;
    }
}
