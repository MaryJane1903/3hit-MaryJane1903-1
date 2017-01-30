package com.company;

public class Main {
    public static void main(String[] args) {
        Stop stop1 = new Stop(new Time(7,17),new Station("Linz"),1);
        Stop stop2 = new Stop(new Time(7,23),new Station("Wels"), 8);
        Stop stop3 = new Stop(new Time(8,30), new Station("Wien"), 5);
        Train train1 = new Train("Test1");
        train1.addStop(stop1);
        train1.addStop(stop2);
        train1.addStop(stop3);

        Stop stop4 = new Stop(new Time(7,50), new Station("Enns"),7 );
        Stop stop5 = new Stop(new Time(9,35), new Station("Wien"), 1);
        Stop stop6 = new Stop(new Time(14,20), new Station("München"), 8);
        Train train2 = new Train("Test2");
        train2.addStop(stop4);
        train2.addStop(stop5);
        train2.addStop(stop6);

        Timetable table1 = new Timetable(new Station("Wien"));
        table1.addTrain(train1);
        table1.addTrain(train2);
        System.out.println(table1.toString());
    }
}