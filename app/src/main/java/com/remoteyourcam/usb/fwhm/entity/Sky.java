package com.remoteyourcam.usb.fwhm.entity;

import java.util.List;

/**
 * Created by Johannbr on 20/10/2015.
 */
public class Sky {
    private List<Star> stars;
    private Background background;

    public Sky(List<Star> stars, Background background) {
        this.stars = stars;
        this.background = background;
    }

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }
}
