package com.example.arnav.delhiasadilliwala;

/**
 * Created by Arnav on 11-01-2017.
 */

public class place {
    private String placeName;
    private String placeDescription;
    private String placeLocation;
    private int placeImage;

    public place(String pName, String pDescription, int pImage, String pLocation) {
        placeName=pName;
        placeDescription=pDescription;
        placeLocation=pLocation;
        placeImage=pImage;
    }
    public place(String pName, String pDescription) {
        placeName=pName;
        placeDescription=pDescription;
    }


    public String getPlaceTitle(){
        return placeName;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public int getPlaceImage() {
        return placeImage;
    }

    public String getPlaceLocation() {
        return placeLocation;
    }
}
