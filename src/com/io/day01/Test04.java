package com.io.day01;

import java.io.FileWriter;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) throws IOException {
		
		//�������������
		FileWriter fw = new FileWriter("c.txt",true);
		
		for( int i=0; i<10; i++ ) {
			fw.write("hello" + i);
			fw.write("\n");
		}
		
		//�ͷ���Դ
		fw.close();
	}
}
