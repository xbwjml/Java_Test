package com.io.day01;

import java.io.FileWriter;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		
		//�������������
		FileWriter fw = new FileWriter("d:\\a.txt");
		
		//����������������󣬲�ˢ�»�����
		fw.write("HelloWorld!!!");
		fw.flush();
		fw.write("Java!!!");
		fw.flush();
		
		//�ͷ���Դ
		fw.close();
		
	}

}
 