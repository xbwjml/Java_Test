package com.io.day01;

import java.io.FileWriter;
import java.io.IOException;

public class test01 {
	public static void main(String[] args) throws IOException {
		
		//�������������
		FileWriter fw = new FileWriter("d:\\a.txt");
		
		//��������������д���ݷ���
		fw.write("IO������");
		
		//ˢ�»�����
		fw.flush();
		
		//�ͷ���Դ
		fw.close();
	}

}
