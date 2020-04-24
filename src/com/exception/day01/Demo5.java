package com.exception.day01;

/**
 * thorw 制造异常，并结束方法;
 * 注意：如果throw的是编译时期异常，必须在方法声明出抛出(throws);
 * 
 * 如何自定义一个异常类:
 * 		只要写一个类去继承Exception或RuntimeException,然后实现多个构造
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
			throw new MyException("成绩范围不对");
		}
		System.out.println("分数正常");
	}
}

/**
 * 自定义异常类
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
