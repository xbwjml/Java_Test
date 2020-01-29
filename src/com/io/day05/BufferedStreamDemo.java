package com.io.day05;

import java.io.*;

/**
 * @author LeeMJ
 * @Date 2020 - 01 - 29 - 21:26
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        /*
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        for( int i=0; i<10; i++ ){
            bw.write("hello"+i);
//            bw.write("\r\n");
            bw.newLine();
            bw.flush();
        }
        bw.close();
        */


        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        String line;
        while ( (line=br.readLine())!=null ){
            System.out.println(line);
        }

        br.close();
    }
}
