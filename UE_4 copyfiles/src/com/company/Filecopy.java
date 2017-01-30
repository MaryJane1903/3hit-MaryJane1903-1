package com.company;

import java.io.*;

/**
 * Created by Marin on 30.01.2017.
 */
public class Filecopy {
    private String src;
    private String des;

    public Filecopy(){

    }
    public void copyTextFile(String src, String des) {

        {
            String s = "";
            String temp = "";
            try (BufferedReader r = new BufferedReader(new FileReader(src));) {

                while ((temp = r.readLine()) != null) {
                    s += temp + "\n";
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(des)));) {
                for (int i = 0; i <= 1; i++) {

                    pw.println(s);
                }

            } catch (IOException e) {
                e.printStackTrace();

            }


        }
    }
    private void copyBinaryFile(String src,String des1)
    {
        int i =0;
        String s="";
        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(src));){
        {
            while((i=bis.read())!=-1)
            {
                s+=(char)i;
            }
        }

    }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    catch (IOException e)
        {
            e.printStackTrace();
        }
        try(BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(des1));){

            int temp=Integer.parseInt(s);
            bos.write(temp);
        }
    catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
}
}
