package com.company;

/**
 * Created by Marin on 03.04.2017.
 */
public class Weitspringer extends Sportler {
    private String rückendwind;

    public Weitspringer(String sportart, String vorname, String nachname, float bestleistung, String datum, String land, String rückendwind) {
        super(sportart, vorname, nachname, bestleistung, datum, land);
        this.rückendwind = rückendwind;
    }
    @Override
    public int compareTo(Sportler o) {
        if(super.compareTo(o) != 0)
            return super.compareTo(o);
        else{
            if(getBestleistung()<o.getBestleistung())
                return 1;
            else if(getBestleistung() > o.getBestleistung())
                return-1;
            else
                return 0;
        }
    }
}
