package com.company;

import java.io.*;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Created by Marin on 06.02.2017.
 */
public class CsvVerarbeiten {

    private String src;
    private Schueler[] schueler;

    public void readCsv(String src) {

        {

            try{
            StreamTokenizer st = new StreamTokenizer(new InputStreamReader(new BufferedInputStream(new FileInputStream(new File(src)))));


                do{
                    st.nextToken();
                    String s =st.sval;
                    String s1=st.sval;
                }
                while(st.ttype != StreamTokenizer.TT_EOF);

            }catch(FileNotFoundException e){
                e.printStackTrace();

            }catch(IOException e) {
                e.printStackTrace();
            }finally{
                try{
                    st.close;
                }
            }

    }
    public void
}