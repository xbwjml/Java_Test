package com.io.day06;

import java.io.*;
import java.util.Date;

/**
 * @author LeeMJ
 * @Date 2020 - 01 - 29 - 21:56
 *
 * 复制文本文件的5种方式
 * 数据源：a.txt
 * 目的地：a_dest.txt
 */
public class CopyFileTest {
    public static void main(String[] args) throws IOException{
        String src = "a.txt";
        String dest = "a_dest.txt";

        method1(src,dest);//基本流一次读写一个字符
        method2(src,dest);//基本流一次读写一个字符数组
        method3(src,dest);//缓冲流一次读写一个字符
        method4(src,dest);//缓冲流一次读写一个字符数组
        method5(src,dest);//缓冲流一次读写一个字符串
    }

    /**
     * 缓冲流一次读取一个字符串
     * @param src
     * @param dest
     * @throws IOException
     */
    public static void method5(String src,String dest) throws IOException {
        Date startDate = new Date();
        long start = startDate.getTime();
        //创建输入缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader(src));
        //创建输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
        //一次读写一个字符串
        String line;
        while ( (line=br.readLine())!=null ){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
        br.close();
        Date endDate = new Date();
        long end = endDate.getTime();
        System.out.println("method5耗时(毫秒):"+(end-start));
    }

    /**
     * 缓冲流一次读写一个字符数组
     * @param src
     * @param dest
     * @throws IOException
     */
    public static void method4(String src,String dest) throws IOException {
        Date startDate = new Date();
        long start = startDate.getTime();
        //创建输入缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader(src));
        //创建输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
        //一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while ( (len=br.read(chs))!=-1 ){
            bw.write(chs,0,len);
        }
        //释放资源
        bw.close();
        br.close();
        Date endDate = new Date();
        long end = endDate.getTime();
        System.out.println("method4耗时(毫秒):"+(end-start));
    }

    /**
     * 缓冲流一次读写一个字符
     * @param src
     * @param dest
     * @throws IOException
     */
    public static void method3(String src,String dest) throws IOException {
        Date startDate = new Date();
        long start = startDate.getTime();
        //创建输入缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader(src));
        //创建输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
        //一次读写一个字符
        int ch;
        while ( (ch=br.read())!=-1 ){
            bw.write((char)ch);
        }
        //释放资源
        bw.close();
        br.close();
        Date endDate = new Date();
        long end = endDate.getTime();
        System.out.println("method3耗时(毫秒):"+(end-start));
    }

    /**
     * 基本流一次读写一个字符数组
     * @param src
     * @param dest
     * @throws IOException
     */
    public static void method2(String src,String dest) throws IOException {
        Date startDate = new Date();
        long start = startDate.getTime();
        //创建输入流对象
        FileReader fr = new FileReader(src);
        //创建输出流对象
        FileWriter fw = new FileWriter(dest);
        //一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while ( (len=fr.read(chs))!=-1 ){
            fw.write(chs,0,len);
        }
        //释放资源
        fw.close();
        fr.close();
        Date endDate = new Date();
        long end = endDate.getTime();
        System.out.println("method2耗时(毫秒):"+(end-start));
    }


    /**
     * 基本流一次读写一个字符
     * @param src
     * @param dest
     */
    public static void method1(String src,String dest) throws IOException {
        Date startDate = new Date();
        long start = startDate.getTime();
        //创建输入流对象
        FileReader fr = new FileReader(src);
        //创建输出流对象
        FileWriter fw = new FileWriter(dest);
        //一次读写一个字符
        int ch;
        while ( (ch=fr.read())!=-1 ){
            fw.write((char)ch);
        }
        //释放资源
        fw.close();
        fr.close();
        Date endDate = new Date();
        long end = endDate.getTime();
        System.out.println("method1耗时(毫秒):"+(end-start));
    }
}
