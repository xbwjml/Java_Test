package com.mytest;
/**
 * 去掉字符串两端的空格
 * 		String trim()
 * 按指定符号分隔字符串 String[] split(String str)
 * 
 * @author Leemi
 *
 */
public class Test01 {

	public static void main(String[] args) {
//		String s1 = "HelloWorld";
//		String s2 = " HelloWorld ";
//		String s3 = " Hello World ";
//
//		System.out.println("===" + s1 + "===");
//		System.out.println("===" + s1.trim() + "===");
//		System.out.println("===" + s2 + "===");
//		System.out.println("===" + s2.trim() + "===");
//		System.out.println("===" + s3 + "===");
//		System.out.println("===" + s3.trim() + "===");
		
		String s4 = "aa,bb,cc,dd";
		String[] arr = s4.split(",");
		for (String s : arr) {
			System.out.println(s);
		}
	}

}
