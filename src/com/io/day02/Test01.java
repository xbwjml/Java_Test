package com.io.day02;

import java.io.FileReader;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		
		//��������������
		FileReader fr = new FileReader("fr.txt");
		
		//��������������Ķ����ݷ���
		
		//һ�ζ�ȡһ���ַ�
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
		
		//�ͷ���Դ
		fr.close();
	}

}
