package com.company;

/**
 * Created by Marin on 16.01.2017.
 */
public class exceptiontest {
    private int i;

    public exceptiontest(int i) {
        this.i = i;
    }

    public void ausgabe() {
    try {
        if (i >= 1 && i <= 100) {
            System.out.println("correct");
        }else
            throw new IndexOutOfMinMax(1,100);

    }catch (IndexOutOfMinMax e)
    {
        System.out.println(e.getMessage());
        System.out.println(e.getStackTrace());
    }
    }
}

