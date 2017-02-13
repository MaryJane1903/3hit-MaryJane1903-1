package com.company;

import java.io.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Marin on 06.02.2017.
 */
public class CsvVerarbeiten {

    private String src;
    public void readCsv(String src) {

        Scanner sc = null;
            try{
                String[] s=new String[128];
                int i =0;

                sc =new Scanner(new BufferedReader(new FileReader(new File(src))));
                sc.useDelimiter(";");
                ArrayList<String> al =new ArrayList<String>();
               while(sc.hasNext()) {
                   if (sc.hasNext()) {
                       s[i] = sc.next();
                       al.add(s[i]);
                       System.out.println(s[i]);
                       i++;

                   }

                   if (sc.hasNext()) {
                       s[i] = sc.next();
                       System.out.println(s[i]);
                       i++;
                   }

                   if (sc.hasNext()) {
                       s[i] = sc.next();
                       al.add(s[i]);
                       System.out.println(s[i]);
                       i++;
                   }

                   if (sc.hasNext()) {
                       s[i] = sc.next();
                       al.add(s[i]);
                       System.out.println(s[i]);
                       i++;
                   }

                   if (sc.hasNext()) {
                       s[i] = sc.next();
                       al.add(s[i]);
                       System.out.println(s[i]);
                       i++;
                   }
                   if (sc.hasNext()) {
                       s[i] = sc.next();
                       al.add(s[i]);
                       System.out.println(s[i]);
                       i++;
                   }

                   if (sc.hasNext()) {
                       s[i] = sc.next();
                       al.add(s[i]);
                       System.out.println(s[i]);
                       i++;
                   }

                   if (sc.hasNext()) {
                       s[i] = sc.next();
                       al.add(s[i]);
                       System.out.println(s[i]);
                       i++;
                   }

               }



            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e) {
                e.printStackTrace();
            }catch (NullPointerException e)
                {
                    e.printStackTrace();
                }

            finally {
                try{
                    sc.close();
                }catch (NullPointerException e)
                {
                    e.printStackTrace();
                }
            }
    }
}
