package com.example.android.quakereport;

/**
 * Created by D A Victor on 26-Dec-17.
 */
public class Earthquake {

    private double mMagnitude;
    private String mPlace;
    private long mTime;
    private String mUrl;

    public Earthquake(double magnitude, String place, long time, String Url) {
        mMagnitude = magnitude;
        mPlace = place;
        mTime = time;
        mUrl = Url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getPlace() {
        return mPlace;
    }

    public long getDate() {
        return mTime;
    }

    public String getUrl() {
        return mUrl;
    }

}
