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
    private String sozialversicherungsnummer;
    private char sex;
    DateTimeFormatter format=DateTimeFormatter.ofPattern("dd,MM,yyyy");
    private String religion;

    public Schueler(String classid, String kv, String lastname, String firstname, String sozialversicherungsnummer, char sex, DateTimeFormatter format, String religion) {
        this.classid = classid;
        this.kv = kv;
        this.lastname = lastname;
        this.firstname = firstname;
        this.sozialversicherungsnummer = sozialversicherungsnummer;
        this.sex = sex;
        this.format = format;
        this.religion = religion;
    }


}
