package com.io.day04;

import java.io.*;

/**
 * @author LeeMJ
 * @Date 2020 - 01 - 29 - 15:15
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {

        //创建输入缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        //创建输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("a副本.txt"));

        //读写数据
        /*
        //一次读写一个字符
        int ch;
        while ( (ch=br.read())!=-1 ){
            bw.write(ch);
        }
        */


        //一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while ( (len=br.read(chs))!=-1 ){
            bw.write(chs,0,len);
        }

        //释放资源
        bw.close();
        br.close();
    }
}
