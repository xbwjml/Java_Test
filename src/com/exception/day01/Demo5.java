package com.exception.day01;

/**
 * thorw �����쳣������������;
 * ע�⣺���throw���Ǳ���ʱ���쳣�������ڷ����������׳�(throws);
 * 
 * ����Զ���һ���쳣��:
 * 		ֻҪдһ����ȥ�̳�Exception��RuntimeException,Ȼ��ʵ�ֶ������
 * @author Leemi
 *
 */
public class Demo5 {
	public static void main(String[] args) {
		try {
			check(101);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void check(int score) throws Exception {
		if( score<0 || score>100 ) {
			throw new MyException("�ɼ���Χ����");
		}
		System.out.println("��������");
	}
}

/**
 * �Զ����쳣��
 * @author Leemi
 *
 */
class MyException extends RuntimeException{

	public MyException() {
		super();
	}

	public MyException(String message) {
		super(message);
	}
	
}
