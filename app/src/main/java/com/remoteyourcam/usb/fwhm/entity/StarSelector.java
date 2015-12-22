package com.remoteyourcam.usb.fwhm.entity;

import java.util.List;

/**
 * Created by Johannbr on 19/10/2015.
 */

public class StarSelector {
    private Integer minWidth;
    private Integer minHeight;
    private double minAverageLuminance;
    private double maxAverageLuminance;
    private Background background;

    public StarSelector(Integer minHeight, Integer minWidth, double minAverageLuminance, double maxAverageLuminance, Background background) {
        this.minHeight = minHeight;
        this.minWidth = minWidth;
        this.minAverageLuminance = minAverageLuminance;
        this.maxAverageLuminance = maxAverageLuminance;
        this.background = background;
    }

    public double getMaxAverageLuminance() {
        return maxAverageLuminance;
    }

    public void setMaxAverageLuminance(double maxAverageLuminance) {
        this.maxAverageLuminance = maxAverageLuminance;
    }


    public Integer getMinWidth() {
        return minWidth;
    }

    public void setMinWidth(Integer minWidth) {
        this.minWidth = minWidth;
    }

    public Integer getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(Integer minHeight) {
        this.minHeight = minHeight;
    }

    public double getMinAverageLuminance() {
        return minAverageLuminance;
    }

    public void setMinAverageLuminance(double minAverageLuminance) {
        this.minAverageLuminance = minAverageLuminance;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }
}
