package com.io.day01;

import java.io.FileWriter;
import java.io.IOException;

public class test01 {
	public static void main(String[] args) throws IOException {

		/**
		 * 1.调用系统资源创建了一个文件 （D:\\a.txt）
		 * 2.创建了以恶搞输出流对象（fw）
		 * 3.把输出流对象指向文件
		 */
		FileWriter fw = new FileWriter("d:\\a.txt");

		//调用输出流对象的写数据方法
		fw.write("IO流测试");

		/**
		 *数据其实没有直接写入文件，其实写到了内存缓冲区，
		 * 所以需要刷新缓冲区
		 */
		fw.flush();
		
		//释放资源(通知系统释放和该文件相关的资源)
		fw.close();
	}

}
