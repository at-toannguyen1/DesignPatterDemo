package com.example.asiantech.designpatterndemo.bridge;

/**
 * RemoteButton
 *
 * @author at-ToanNguyen
 */

abstract class RemoteButton {
    private EntertainmentDevice theDevice;

    RemoteButton(EntertainmentDevice theDevice) {
        this.theDevice = theDevice;
    }

    void buttonFivePressed() {
        theDevice.buttonFivePressed();
    }

    void buttonSixPressed() {
        theDevice.buttonSixPressed();
    }

    String deviceFeedback() {
        return theDevice.deviceFeedback();
    }

}
