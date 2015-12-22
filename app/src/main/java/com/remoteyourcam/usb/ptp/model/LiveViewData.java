/**
 * Copyright 2013 Nils Assbeck, Guersel Ayaz and Michael Zoech
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.remoteyourcam.usb.ptp.model;

import java.nio.ByteBuffer;

import android.graphics.Bitmap;

public class LiveViewData {

    public Bitmap bitmap;

    public int zoomFactor;
    public int zoomRectLeft;
    public int zoomRectTop;
    public int zoomRectRight;
    public int zoomRectBottom;

    public boolean hasHistogram;
    public ByteBuffer histogram;

    // dimensions are in bitmap size
    public boolean hasAfFrame;
    public int nikonAfFrameCenterX;
    public int nikonAfFrameCenterY;
    public int nikonAfFrameWidth;
    public int nikonAfFrameHeight;

    public int nikonWholeWidth;
    public int nikonWholeHeight;

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public int getZoomFactor() {
        return zoomFactor;
    }

    public void setZoomFactor(int zoomFactor) {
        this.zoomFactor = zoomFactor;
    }

    public int getZoomRectLeft() {
        return zoomRectLeft;
    }

    public void setZoomRectLeft(int zoomRectLeft) {
        this.zoomRectLeft = zoomRectLeft;
    }

    public int getZoomRectTop() {
        return zoomRectTop;
    }

    public void setZoomRectTop(int zoomRectTop) {
        this.zoomRectTop = zoomRectTop;
    }

    public int getZoomRectRight() {
        return zoomRectRight;
    }

    public void setZoomRectRight(int zoomRectRight) {
        this.zoomRectRight = zoomRectRight;
    }

    public int getZoomRectBottom() {
        return zoomRectBottom;
    }

    public void setZoomRectBottom(int zoomRectBottom) {
        this.zoomRectBottom = zoomRectBottom;
    }

    public boolean isHasHistogram() {
        return hasHistogram;
    }

    public void setHasHistogram(boolean hasHistogram) {
        this.hasHistogram = hasHistogram;
    }

    public ByteBuffer getHistogram() {
        return histogram;
    }

    public void setHistogram(ByteBuffer histogram) {
        this.histogram = histogram;
    }

    public boolean isHasAfFrame() {
        return hasAfFrame;
    }

    public void setHasAfFrame(boolean hasAfFrame) {
        this.hasAfFrame = hasAfFrame;
    }

    public int getNikonAfFrameCenterX() {
        return nikonAfFrameCenterX;
    }

    public void setNikonAfFrameCenterX(int nikonAfFrameCenterX) {
        this.nikonAfFrameCenterX = nikonAfFrameCenterX;
    }

    public int getNikonAfFrameCenterY() {
        return nikonAfFrameCenterY;
    }

    public void setNikonAfFrameCenterY(int nikonAfFrameCenterY) {
        this.nikonAfFrameCenterY = nikonAfFrameCenterY;
    }

    public int getNikonAfFrameWidth() {
        return nikonAfFrameWidth;
    }

    public void setNikonAfFrameWidth(int nikonAfFrameWidth) {
        this.nikonAfFrameWidth = nikonAfFrameWidth;
    }

    public int getNikonAfFrameHeight() {
        return nikonAfFrameHeight;
    }

    public void setNikonAfFrameHeight(int nikonAfFrameHeight) {
        this.nikonAfFrameHeight = nikonAfFrameHeight;
    }

    public int getNikonWholeWidth() {
        return nikonWholeWidth;
    }

    public void setNikonWholeWidth(int nikonWholeWidth) {
        this.nikonWholeWidth = nikonWholeWidth;
    }

    public int getNikonWholeHeight() {
        return nikonWholeHeight;
    }

    public void setNikonWholeHeight(int nikonWholeHeight) {
        this.nikonWholeHeight = nikonWholeHeight;
    }
}
