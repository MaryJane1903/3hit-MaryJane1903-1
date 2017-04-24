package com.company;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.TreeSet;

/**
 * Created by Marin on 03.04.2017.
 */
public class Sportveranstaltung {
    private String name;
    private TreeSet<Sportler> ts;
    public Sportveranstaltung (String name)
    {
        this.name =name;
        this.ts=new TreeSet<Sportler>();
    }
    public void lese(String file)
    {
        String str;
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            br.readLine();
            while((str=br.readLine())!=null){
                System.out.println(str);
            }

            String[] s= str.split(";");
            if(s[0].equals("Speer"))
                ts.add(new Speerwerfer(s[0], s[1], s[2], Float.parseFloat(s[3]),s[6],s[7] ,s[4]));
            else if(s[0].equals("100-Meter"))
                ts.add(new Sprinter(s[0], s[1], s[2], Float.parseFloat(s[3]),s[6],s[7] ,s[5]));
            else if(s[0].equals("Weitsprung"))
                ts.add(new Weitspringer(s[0], s[1], s[2], Float.parseFloat(s[3]),s[6],s[7] ,s[5]));



        }catch(FileNotFoundException o){
            o.printStackTrace();
        }catch(IOException o){
            o.printStackTrace();
        }



    }
    public void printAll(){
        for (Sportler sportler: ts){
            sportler.drucke();
        }
    }
    public void save() {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Sportler.dat"))) {
            os.writeObject(ts);
        } catch (IOException o) {
            o.printStackTrace();
        }
    }
        public void load(){
            ts.clear();
            try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("Sportler.dat"))) {
                ts=(TreeSet<Sportler>) is.readObject();
            } catch (IOException o) {
                o.printStackTrace();
            }catch (ClassNotFoundException o)
            {
                o.printStackTrace();
    }
    }

}
