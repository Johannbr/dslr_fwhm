package com.remoteyourcam.usb.fwhm.service;

import android.graphics.Color;

import com.remoteyourcam.usb.fwhm.entity.PixelsArea;
import com.remoteyourcam.usb.ptp.model.LiveViewData;

/**
 * Created by Johannbr on 20/10/2015.
 */
public class PixelsAreaService {
    private PixelsArea pixelsArea;
    private LiveViewData liveViewData;
    private int width;
    private int height;
    private int[] pixels;
    private float[][] pixelsLuminanceXY;

    public PixelsAreaService(LiveViewData liveViewData, int height, int width) {
        this.liveViewData = liveViewData;
        this.height = height;
        this.width = width;
    }

    public void init(){
        PixelsArea pa = new PixelsArea(this.width, this.height);
        this.pixels = new int[width*height];
        this.liveViewData.getBitmap().getPixels(this.pixels, pa.getOFFSET(), pa.getStride(), pa.getX(), pa.getY(), this.width, this.height);
    }

    public void convertToTwoDimensionalArraysWithValuesOfLuminance() {
        this.pixelsLuminanceXY = new float[this.width][this.height];
        float[] pixelsValue = new float[this.width * this.height];
        float[] pixelHSV = new float[3];
        int y = 0;
        int x = 0;
        for (int i = 0; i < this.pixels.length; i++) {
            Color.colorToHSV(this.pixels[i], pixelHSV);
            if (i % this.width == 0 && i!=0) {
                y++;
                x = 0;
            }
            this.pixelsLuminanceXY[x][y] = pixelHSV[2];
            x++;
        }
    }


    public float[][] getPixelsLuminanceXY() {
        return pixelsLuminanceXY;
    }

    public void setPixelsLuminanceXY(float[][] pixelsLuminanceXY) {
        this.pixelsLuminanceXY = pixelsLuminanceXY;
    }

    public LiveViewData getLiveViewData() {
        return liveViewData;
    }

    public void setLiveViewData(LiveViewData liveViewData) {
        this.liveViewData = liveViewData;
    }

    public PixelsArea getPixelsArea() {
        return pixelsArea;
    }

    public void setPixelsArea(PixelsArea pixelsArea) {
        this.pixelsArea = pixelsArea;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int[] getPixels() {
        return pixels;
    }

    public void setPixels(int[] pixels) {
        this.pixels = pixels;
    }
}
