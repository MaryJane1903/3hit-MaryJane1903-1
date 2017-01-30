package com.company;

/**
 * Created by Marin on 19.01.2017.
 */
public class Time implements Comparable{
    private int minutes;
    private int hours;

    public Time(int hours, int minutes) {
        this.minutes = minutes;
        this.hours = hours;

    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public int compareTo(Object o) {
        Time obj =(Time)o;
        if((obj == null) || (obj.getClass() != getClass()))
            return -1;
        else
        {
            int i = getHours() - obj.getHours();
            if(i!=0)
                return i;
            else
            {
                return getMinutes() - obj.getMinutes();
            }
        }
    }

    @Override
    public String toString() {
        return hours+":"+minutes;
    }
}
