package com.IOSenior.day01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �������ļ�ֻ�����ֽ������и���
 * @author Leemi
 *
 */
public class Demo3 {
	public static void main(String[] args) throws IOException {
		
		//�����ֽ�����������
		FileInputStream fis = new FileInputStream("����ͼƬ.png");
		//�����ֽ����������
		FileOutputStream fos = new FileOutputStream("d:\\ͼƬ����.png");
		
		//һ�ζ�дһ���ֽ�����
		int len;
		byte[] bys = new byte[1024];
		while( (len=fis.read(bys)) != -1 ) {
			fos.write(bys,0,len);
		}
		
		//�ֽ�������Ҫˢ�»�����
		
		//�ͷ���Դ
		fos.close();
		fis.close();
	}

}
