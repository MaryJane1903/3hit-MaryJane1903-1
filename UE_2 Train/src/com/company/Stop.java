package com.company;

/**
 * Created by Marin on 19.01.2017.
 */
public class Stop {
    private Time time;
    private int Bahnsteig;
    private Station station;


    public Stop(Time time, Station station, int Bahnsteig) {
        this.time = time;
        this.station = station;
        this.Bahnsteig = Bahnsteig;
    }

    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }

    public int getBahnsteig() {
        return Bahnsteig;
    }
    public void setBahnsteig(int bahnsteig) {
        this.Bahnsteig = bahnsteig;
    }

    public Station getStation() {
        return station;
    }
    public void setStation(Station station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "Stop{" +
                "time=" + time +
                ", Bahnsteig=" + Bahnsteig +
                ", station=" + station +
                '}';
    }
}
