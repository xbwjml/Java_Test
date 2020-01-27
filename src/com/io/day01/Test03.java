package com.io.day01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter 写数据的五种方法s
 * @author Leemi
 *
 */
public class Test03 {
	public static void main(String[] args) throws IOException {
		
		//创建输出流对象
		FileWriter fw = new FileWriter("b.txt");
		
		/**
		 * 写一个字符串数组
		 */
//		fw.write("ABCDE");
		
		/**
		 * 写一个字符
		 */
		fw.write(98);
		
		//释放资源
		fw.close();
	}

}
