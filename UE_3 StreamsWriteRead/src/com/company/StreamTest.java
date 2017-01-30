package com.company;

import java.io.*;

/**
 * Created by Marin on 23.01.2017.
 */
public class StreamTest {
    private String filename = "test.txt";
    private String amk="ZEILE";
    public StreamTest() {

    }

    public void stringWrite() {
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));) {
            for(int i=0;i<=100;i++){
                pw.printf("Zeile %d", i);
                pw.println();
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    public String stringReader()
    {
        int i=0;
        String s="";
        String temp="";
       try(BufferedReader r = new BufferedReader(new FileReader(filename));){

      // while((i=r.read()) != -1){
       //    s+=(char)i;
           while((temp = r.readLine())!=null)
           {
               s+= temp + "\n";
           }

       }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }catch(IOException e)
       {
           e.printStackTrace();
       }
       return s;
    }
}