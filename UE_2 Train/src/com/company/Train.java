package com.company;

/**
 * Created by Marin on 19.01.2017.
 */
import java.util.Map;
import java.util.TreeMap;
public class Train {
    private String trainName;
    private TreeMap<Time, Stop> treemap;

    public Train(String trainname) {
        this.trainName = trainname;
        treemap = new TreeMap<Time, Stop>();

    }
    public String firstStop()
    {
        return treemap.firstEntry().getValue().getStation().getStationname();
    }
    public void addStop(Stop stop)
    {
        treemap.put(stop.getTime(), stop);
    }
    public String lastStop()
    {
        return treemap.lastEntry().getValue().getStation().getStationname();
    }


    @Override
    public String toString() {
        return "Train{" +
                "trainName='" + trainName + '\'' +
                ", treemap=" + treemap +
                '}';
    }
}
