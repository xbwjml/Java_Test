package com.exception.day01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 24 - 15:35
 */
public class Demo1 {
    public static void main(String[] args) {
       
    	//当我们不想处理异常，或者没有能力处理异常，可以选择抛出异常,谁调用方法谁就处理异常。
    	//使用关键字throws在方法声明处抛出异常
    }
    
    public void method() throws IOException {
    	FileWriter fw = new FileWriter("a.txt");
    }
}
