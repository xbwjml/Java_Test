package com.IOSenior.day02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class Demo3 {
	public static void main(String[] args) throws IOException {
//		method1();
//		method2();
//		method3();
	}

	private static void method3() throws IOException {
		//创建属性列表对象
		Properties prop = new Properties();
		//添加映射关系
		prop.put("杨过", "小龙女");
		prop.put("郭靖", "黄蓉");
		prop.put("令狐冲", "任盈盈");
		//创建输出流对象
		FileWriter fw = new FileWriter("e.txt");
		
		prop.store(fw, "Hello!!!");
	}

	private static void method2() throws FileNotFoundException, IOException {
		//创建属性列表对象
		Properties prop = new Properties();
		//创建一个输入流对象
		FileReader fr = new FileReader("d.txt");
		
		prop.load(fr);
		
		//释放资源
		fr.close();
		System.out.println(prop);
	}

	private static void method1() throws FileNotFoundException {
		//创建属性列表对象
		Properties prop = new Properties();
		//添加映射关系
		prop.setProperty("老大", "刘备");
		prop.setProperty("老二", "关羽");
		prop.setProperty("老三", "张飞");
		//创建打印流对象
		PrintWriter out = new PrintWriter("d.txt");
		prop.list(out);
		//释放资源
		out.close();
	}
}
