package com.io.day01;

import java.io.FileWriter;
import java.io.IOException;

public class test01 {
	public static void main(String[] args) throws IOException {
		
		//创建输出流对象
		FileWriter fw = new FileWriter("d:\\a.txt");
		
		//调用输出流对象的写数据方法
		fw.write("IO流基础");
		
		//刷新缓冲区
		fw.flush();
		
		//释放资源
		fw.close();
	}

}
