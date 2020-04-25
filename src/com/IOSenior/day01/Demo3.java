package com.IOSenior.day01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 二进制文件只能用字节流进行复制
 * @author Leemi
 *
 */
public class Demo3 {
	public static void main(String[] args) throws IOException {
		
		//创建字节输入流对象
		FileInputStream fis = new FileInputStream("测试图片.png");
		//创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("d:\\图片副本.png");
		
		//一次读写一个字节数组
		int len;
		byte[] bys = new byte[1024];
		while( (len=fis.read(bys)) != -1 ) {
			fos.write(bys,0,len);
		}
		
		//字节流不需要刷新缓冲区
		
		//释放资源
		fos.close();
		fis.close();
	}

}
