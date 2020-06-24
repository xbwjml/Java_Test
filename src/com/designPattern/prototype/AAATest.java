package com.designPattern.prototype;

public class AAATest {
	public static void main(String[] args) {
		AAA aaa = new AAA("张三",20);
		AAA aaa2 = (AAA) aaa.clone();
		System.out.println(aaa == aaa2);
	}
}
