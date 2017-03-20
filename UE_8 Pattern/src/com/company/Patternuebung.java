package com.company;

/**
 * Created by Marin on 20.03.2017.
 */
public class Patternuebung {
    private String ip;
    private String email;

    public Patternuebung()
    {

    }

    public void patternAusgabeip(String ip)
    {
        String s="(1([0-9][0-9]){0,2}|2([0-4][0-9]){0,2}|25[0-5])" + "\\.(1([0-9][0-9]){0,2}|2([0-4][0-9]){0,2}|25[0-5])"+ "\\.(1([0-9][0-9]){0,2}|2([0-4][0-9]){0,2}|25[0-5])"+ "\\.(1([0-9][0-9]){0,2}|2([0-4][0-9]){0,2}|25[0-5])";


    if(ip.matches(s)) {
        System.out.println("richtig");
    }else{
            System.out.println("falsch");
        }
    }

    public void patternAusgabeemail(String email)
    {

    }

}
