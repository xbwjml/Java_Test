package com.io.day01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter д���ݵ����ַ���s
 * @author Leemi
 *
 */
public class Test03 {
	public static void main(String[] args) throws IOException {
		
		//�������������
		FileWriter fw = new FileWriter("b.txt");
		
		/**
		 * дһ���ַ�������
		 */
//		fw.write("ABCDE");
		
		/**
		 * дһ���ַ�
		 */
		fw.write(98);
		
		//�ͷ���Դ
		fw.close();
	}

}
