package com.remoteyourcam.usb.fwhm.service;

import com.remoteyourcam.usb.fwhm.entity.Background;
import com.remoteyourcam.usb.fwhm.entity.StarSelector;
import com.remoteyourcam.usb.ptp.model.LiveViewData;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by Johannbr on 20/10/2015.
 */
public class StarSelectorService {
    private StarSelector starSelector;
    private PixelsAreaService pixelsAreaService;
    private LiveViewData liveViewData;
    private int height;
    private int width;

    public StarSelectorService(PixelsAreaService pixelsAreaService) {
        this.pixelsAreaService = pixelsAreaService;
    }
    public StarSelectorService( PixelsAreaService pixelsAreaService, int height, int width) {
        this.pixelsAreaService = pixelsAreaService;
        this.height = height;
        this.width = width;
    }

    //1-Déterminer une surface à analyser
    //2-Prendre le point le plus brillant qui correspond à StarSelector
    //3-Voir si autour du point correspond l'étoile s'étend de la demi-largeur et demi-hauteur qui correspond à StarSelector
    //4-Créer un objet étoile
    //5-Ajouter l'étoile à la liste d'étoiles dans Sky
    //6-Réitérer en partant de 2
public void init(){
//    PixelsAreaService pas = new PixelsAreaService(this.liveViewData);
//    pas.setHeight(this.height);
//    pas.setWidth(this.width);
//    pas.init();
    //1-
    pixelsAreaService.convertToTwoDimensionalArraysWithValuesOfLuminance();
//    System.out.println(Arrays.toString(pixelsAreaService.getPixelsValueXY()));
    //2-
    Background bg = new Background(0.1);
    this.starSelector = new StarSelector(5,5,0.5,1,bg);
    findPixelsAsBrightAsInStarSelector();
    //3-



}

    public void findPixelsAsBrightAsInStarSelector() {
        int x;
        int y;
        float brightest=0;
        int[][] brightestCoord = new int[10000][2];
        float[][] pixels = pixelsAreaService.getPixelsLuminanceXY();
        int incr = 0;
        for (x = 0; x < pixelsAreaService.getWidth(); x++) {
            for (y = 0; y < pixelsAreaService.getHeight(); y++) {
                float currentValue = pixels[x][y];
                System.out.println("luminance: "+ currentValue);
                System.out.println("x_incr: "+ x);
                System.out.println("y_incr: "+ y);
                if (currentValue >= this.starSelector.getMinAverageLuminance() && currentValue <= this.starSelector.getMaxAverageLuminance()) {
                    brightestCoord[incr][0] = x;
                    brightestCoord[incr][1] = y;
                    incr++;
                    System.out.println("x: "+brightestCoord[incr][0]+" / y:"+brightestCoord[incr][1]);
                    System.out.println("incr: "+ incr);
                }
            }
        }
//        System.out.println("xy: "+pixels[brightestCoord[0]][brightestCoord[1]]);

    }


        public static float[] findTopKHeap(float[] arr, int k) {
        PriorityQueue<Float> pq = new PriorityQueue<Float>();
        for (float xx : arr) {
            if (pq.size() < k) pq.add(xx);
            else if (pq.peek() < xx) {
                pq.poll();
                pq.add(xx);
            }
        }
        float[] res = new float[k];
        for (int i =0; i < k; i++) res[i] = pq.poll();
        return res;
    }


}
