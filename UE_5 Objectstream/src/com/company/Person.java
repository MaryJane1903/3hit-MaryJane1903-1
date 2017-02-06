package com.company;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Marin on 03.02.2017.
 */
public class Person {

    private String vorname;
    private String nachname;

    public Person (String Vorname, String Nachname)
    {
        this.vorname=Vorname;
        this.nachname=Nachname;
    }

}
