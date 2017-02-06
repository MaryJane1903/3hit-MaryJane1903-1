package com.company;

import java.time.format.DateTimeFormatter;

/**
 * Created by Marin on 06.02.2017.
 */
public class Schueler {
    private String classid;
    private String kv;
    private String lastname;
    private String firstname;
    private char sex;
    DateTimeFormatter format=DateTimeFormatter.ofPattern("dd,MM,yy");
    private String religion;

    public Schueler(String classid, String kv, String lastname, String firstname, char sex, DateTimeFormatter format, String religion) {
        this.classid = classid;
        this.kv = kv;
        this.lastname = lastname;
        this.firstname = firstname;
        this.sex = sex;
        this.format = format;
        this.religion = religion;
    }


}
