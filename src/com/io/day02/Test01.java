package com.io.day02;

import java.io.FileReader;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		
		//创建输入流对象
		FileReader fr = new FileReader("fr.txt");
		
		//调用输入流对象的读数据方法
		
		//一次读取一个字符
//		int ch = fr.read();
//		System.out.println(ch);
//		System.out.println((char)ch);
//		
//		ch = fr.read();
//		System.out.println(ch);
//		System.out.println((char)ch);
//		
//		System.out.println(fr.read());
//		System.out.println(fr.read());
//		System.out.println(fr.read());
		
		int ch;
		while( (ch=fr.read()) != -1 ) {
			System.out.print((char)ch);
		}
		
		//释放资源
		fr.close();
	}

}
