package com.company;

public class Main {

    public static void main(String[] args) {

        Sportveranstaltung a= new Sportveranstaltung("Olympia 2017");
        a.lese("Sportler.csv");
        a.printAll();
        a.save();
        a.load();
    }
}
