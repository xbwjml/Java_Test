package com.exception.day01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 24 - 15:35
 */
public class Demo1 {
    public static void main(String[] args) {
       
    	//�����ǲ��봦���쳣������û�����������쳣������ѡ���׳��쳣,˭���÷���˭�ʹ����쳣��
    	//ʹ�ùؼ���throws�ڷ����������׳��쳣
    }
    
    public void method() throws IOException {
    	FileWriter fw = new FileWriter("a.txt");
    }
}
