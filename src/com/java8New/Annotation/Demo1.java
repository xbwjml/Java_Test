package com.java8New.Annotation;

public class Demo1 {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(method(s));
	}
	
	static String method(String s) {
		try {
			s += "_try";
			System.out.println("try执行了");
			return s;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally执行了");
			s += "_finally";
//			return s;
		}
		System.out.println("----");
		return s;
	}
}
