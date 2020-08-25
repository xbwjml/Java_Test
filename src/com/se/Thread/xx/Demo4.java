package com.se.Thread.xx;

public class Demo4 {
	public static void main(String[] args) {
		Dad d = new Son();
		Integer i;
		float f;
	}
}

class Dad {
	String name = "老王";
	
}

class Son extends Dad{
	String name = "小王";
}
