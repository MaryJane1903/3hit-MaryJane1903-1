package com.company;

/**
 * Created by Marin on 16.01.2017.
 */
public class IndexOutOfMinMax extends RuntimeException {
    private int min=1;
    private int max=50;
    public IndexOutOfMinMax() {

    }
    public IndexOutOfMinMax(String msg){
        super(msg);
    }
    public IndexOutOfMinMax(int min,int max)
    {
       super("Harambe weil "+min+"... "+max);
    }
}
