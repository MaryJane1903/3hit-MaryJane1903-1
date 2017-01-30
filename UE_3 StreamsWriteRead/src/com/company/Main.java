package com.company;

public class Main {

    public static void main(String[] args) {
        StreamTest str = new StreamTest();
        str.stringWrite();
        System.out.println(System.getProperty("user.dir"));
        System.out.println(str.stringReader());
    }
}
