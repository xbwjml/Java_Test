package com.io.day01;

import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		
		//创建输出流对象
		FileWriter fw = new FileWriter("d:\\a.txt");
		
		//利用输出流创建对象，并刷新缓冲区
		fw.write("HelloWorld!!!");
		fw.flush();
		fw.write("Java!!!");
		fw.flush();
		
		//释放资源
		fw.close();
		
	}

}
 