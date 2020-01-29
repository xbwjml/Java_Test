package com.io.day06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author LeeMJ
 * @Date 2020 - 01 - 29 - 22:48
 */
public class ArrayListToFileTest {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        //创建输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        for (String s: array) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
    }
}
