package com.example.asiantech.designpatterndemo.bridge;

/**
 * EntertainmentDevice
 *
 * @author at-ToanNguyen
 */

abstract class EntertainmentDevice {
    int deviceState;
    int maxSetting;

    public abstract void buttonFivePressed();

    public abstract void buttonSixPressed();

    /**
     *
     * @return String the Channel at present
     */
    String deviceFeedback() {
        if (deviceState > maxSetting || deviceState < 0) {
            deviceState = 0;
        }
        return "Channel " + deviceState;
    }
}
