package com.company;

/**
 * Created by Marin on 19.01.2017.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Timetable {
    private Station station;
    private Train train;
    ArrayList<Train> trains;
    public Timetable(Station station) {
        this.station = station;

        trains = new ArrayList<Train>();
    }

    public void addTrain(Train newTrain)
    {
        trains.add(newTrain);
    }

    @Override
    public String toString() {
        Iterator iter = trains.iterator();
        String stationtrains= null;
        while (iter.hasNext())
        {
            if (stationtrains!=null)
                stationtrains = stationtrains + iter.next().toString() + "\n";
            else
                stationtrains = iter.next().toString() + "\n";
        }
        return station.getStationname() + "\n" +  stationtrains;
    }
}

