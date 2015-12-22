package com.remoteyourcam.usb.fwhm.entity;

/**
 * Created by me on 20/10/2015.
 */
public class Background {
    private double averageLuminance;

    public Background(double averageBrightness) {
        this.averageLuminance = averageBrightness;
    }

    public double getAverageBrightness() {
        return averageLuminance;
    }

    public void setAverageBrightness(double averageLuminance) {
        this.averageLuminance = averageLuminance;
    }
}
