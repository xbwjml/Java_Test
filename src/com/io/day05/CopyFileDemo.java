package com.io.day05;

import java.io.*;

/**
 * @author LeeMJ
 * @Date 2020 - 01 - 29 - 21:40
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //创建输入缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
//        //创建输出缓冲流对象
//        BufferedWriter bw = new BufferedWriter(new FileWriter("a副本2.txt"));

    	
    	
    	
        //读写数据，一次读写一行
        String line;
        while ( (line=br.readLine())!=null ){
//            bw.write(line);
//            bw.newLine();
//            bw.flush();
        	System.out.println(line);
        }
//
//        //释放资源
//        bw.close();
        br.close();
    }
}
