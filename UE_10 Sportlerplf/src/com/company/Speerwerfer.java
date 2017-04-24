package com.company;

/**
 * Created by Marin on 03.04.2017.
 */
public class Speerwerfer extends Sportler {
    private String Wettkampfspeer;

    public Speerwerfer(String sportart, String vorname, String nachname, float bestleistung, String datum, String land, String wettkampfspeer) {
        super(sportart, vorname, nachname, bestleistung, datum, land);
        this.Wettkampfspeer = wettkampfspeer;
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
