package com.io.day02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) throws IOException {
		
		//��������������
		FileReader fr = new FileReader("fr.txt");
		
		//�������������
		FileWriter fw = new FileWriter("dest.java");
		
		//��д����
		int ch;
		while( (ch=fr.read()) != -1 ) {
			fw.write(ch);
		}
		
		//�ͷ���Դ
		fw.close();
		fr.close();
	}

}
