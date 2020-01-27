package com.io.day02;

import java.io.FileReader;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		
		//创建输入流对象
		FileReader fr = new FileReader("fr.txt");
		
		//调用输入流对象的读数据方法
		//一次读取一个字符数组的数据
		char[] chs = new char[1024];
		int len;
		while( (len=fr.read(chs)) != -1  ) {
			System.out.print(new String(chs,0,len));
		}
		
		//释放资源
		fr.close();
	}

}
