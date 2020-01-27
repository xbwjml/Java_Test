package com.io.day02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) throws IOException {
		
		//创建输入流对象
		FileReader fr = new FileReader("fr.txt");
		
		//创建输出流对象
		FileWriter fw = new FileWriter("dest.java");
		
		//读写数据
		int ch;
		while( (ch=fr.read()) != -1 ) {
			fw.write(ch);
		}
		
		//释放资源
		fw.close();
		fr.close();
	}

}
