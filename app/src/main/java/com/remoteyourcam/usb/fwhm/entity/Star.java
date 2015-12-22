package com.remoteyourcam.usb.fwhm.entity;

/**
 * Created by Johannbr on 19/10/2015.
 */
public class Star {

    private Integer width;
    private Integer height;
    private float[] averageBrightness;
    private int[] coordinates;

    public Star(Integer width, Integer height, float[] averageBrightness, int[] coordinates) {
        this.width = width;
        this.height = height;
        this.averageBrightness = averageBrightness;
        this.coordinates = coordinates;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int[] coordinates) {
        this.coordinates = coordinates;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public float[] getAverageBrightness() {
        return averageBrightness;
    }

    public void setAverageBrightness(float[] averageBrightness) {
        this.averageBrightness = averageBrightness;
    }
}
