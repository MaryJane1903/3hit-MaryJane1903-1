package com.company;

import java.io.Serializable;

/**
 * Created by Marin on 03.04.2017.
 */
public class Sportler implements Comparable<Sportler>, Serializable {
    private String Sportart;
    private String Vorname;
    private String Nachname;
    private float bestleistung;
    private String Datum;
    private String Land;

    public Sportler(String sportart, String vorname, String nachname, float bestleistung, String datum, String land) {
        this.Sportart = sportart;
        this.Vorname = vorname;
        this.Nachname = nachname;
        this.bestleistung = bestleistung;
        this.Datum = datum;
        this.Land = land;
    }

    public String sportart() {
        return Sportart;
    }

    public void setSportart(String sportart) {
        Sportart = sportart;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public float getBestleistung() {
        return bestleistung;
    }

    public void setBestleistung(float bestleistung) {
        this.bestleistung = bestleistung;
    }

    public String getDatum() {
        return Datum;
    }

    public void setDatum(String datum) {
        Datum = datum;
    }

    public String getLand() {
        return Land;
    }

    public void setLand(String land) {
        Land = land;
    }


    public void drucke() {
        System.out.println( "Sportler{" +
                "Sportart='" + Sportart + '\'' +
                ", Vorname='" + Vorname + '\'' +
                ", Nachname='" + Nachname + '\'' +
                ", bestleistung=" + bestleistung +
                ", Datum='" + Datum + '\'' +
                ", Land='" + Land + '\'' +
                '}');
    }
    @Override
    public int compareTo(Sportler o){
        return this.sportart().compareTo(o.sportart());
    }
}
