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
	 * ���ָ��Ŀ¼�����е�java�ļ�(������Ŀ¼)
	 * @param file
	 */
	public static void method(File file) {
		if( file.isDirectory() ) {
			File[] files = file.listFiles();
			for( File f : files) {
				//�ж��Ƿ����ļ�����
				if( f.isFile() ) {
					if( f.getName().endsWith(".java") ) {
						System.out.println(f.getName());
					}
				}else {
					//��һ��Ŀ¼����
					method(f);
				}
			}
		}
	}
	
	
	/**
	 * ɾ��ָ��Ŀ¼
	 * ע�����Ҫɾ��һ��Ŀ¼������Ҫɾ�����Ŀ¼�����е����ļ�����Ŀ¼
	 * @param file
	 */
	public static void method2(File file) {
		if( file.isDirectory() ) {
			//ɾ���Լ����е����ļ�����Ŀ¼
			File[] files = file.listFiles();
			for( File f : files ) {
				if( f.isFile() ) {
					System.out.println(f.getName());
					f.delete();
				}else {
					method2(f);
				}
			}
			//ɾ���Լ�
			System.out.println(file.getName());
			file.delete();
		}
	}
}
