package com.company;

import java.io.*;

public class Main implements Serializable {

    public static void main(String[] args) {

        Person p =new Person("Hansi","Hinterseher");
        Person p1=new Person("Nikola","Dumbo");
    }
    public void schreiben()
    {
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("object.ser"));){
            oos.writeInt(12345);
            oos.writeObject(p);
            oos.writeObject(p1);
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void lesen()
    {
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("object.ser")),){
            int i=ois.readInt();
            String s=(String) ois.readObject();
            String ss=(String) ois.readObject();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
