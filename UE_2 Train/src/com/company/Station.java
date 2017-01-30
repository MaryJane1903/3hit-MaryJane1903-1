package com.company;

/**
 * Created by Marin on 19.01.2017.
 */
public class Station {
    private String stationName;

    public Station(String stationName) {
        this.stationName = stationName;
    }

    public String getStationname() {
        return stationName;
    }

    public void setStationname(String stationname) {
        this.stationName = stationname;
    }

    @Override
    public String toString() {
        return stationName;
    }
}
