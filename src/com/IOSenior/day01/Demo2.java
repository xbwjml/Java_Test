package com.IOSenior.day01;

import java.io.File;

public class Demo2 {
	public static void main(String[] args) {
		File f = new File("src");
		method(f);
		
		File f2 = new File("D:\\deleteTest");
		method2(f2);
	}
	
	/**
	 * 输出指定目录下所有的java文件(包含子目录)
	 * @param file
	 */
	public static void method(File file) {
		if( file.isDirectory() ) {
			File[] files = file.listFiles();
			for( File f : files) {
				//判断是否是文件对象
				if( f.isFile() ) {
					if( f.getName().endsWith(".java") ) {
						System.out.println(f.getName());
					}
				}else {
					//是一个目录对象
					method(f);
				}
			}
		}
	}
	
	
	/**
	 * 删除指定目录
	 * 注：如果要删除一个目录，则需要删除这个目录下所有的子文件和子目录
	 * @param file
	 */
	public static void method2(File file) {
		if( file.isDirectory() ) {
			//删除自己所有的子文件和子目录
			File[] files = file.listFiles();
			for( File f : files ) {
				if( f.isFile() ) {
					System.out.println(f.getName());
					f.delete();
				}else {
					method2(f);
				}
			}
			//删除自己
			System.out.println(file.getName());
			file.delete();
		}
	}
}
