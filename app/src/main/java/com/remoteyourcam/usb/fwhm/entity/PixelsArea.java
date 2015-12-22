package com.remoteyourcam.usb.fwhm.entity;

import com.remoteyourcam.usb.ptp.model.LiveViewData;

/**
 * Created by Johannbr on 20/10/2015.
 */
public class PixelsArea {
    private static final int OFFSET = 0;
    private int stride;
    private static final int LIVEVIEW_WIDTH = 768; //TODO: get from liveView object
    private static final int LIVEVIEW_HEIGHT = 512; //TODO: get from liveView object
    private int x;
    private int y;
    private int width;
    private int height;

    public PixelsArea(int width, int height) {
        this.width = width;
        this.height = height;
        this.stride = this.width;
        this.x=(LIVEVIEW_WIDTH-width)/2;
        this.y=(LIVEVIEW_HEIGHT-height)/2;
    }

    public static int getLiveviewWidth() {
        return LIVEVIEW_WIDTH;
    }

    public static int getLiveviewHeight() {
        return LIVEVIEW_HEIGHT;
    }

    public static int getOFFSET() {
        return OFFSET;
    }

    public int getStride() {
        return stride;
    }

    public void setStride(int stride) {
        this.stride = stride;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
}
