package com.interfac.day01;

public class Demo5 {
	public static void main(String[] args) {
		Father f = new Son();
		System.out.println(f.name);
		f.sayName();
		f.methodStatic();
	}
}

class Father {
	String name = "老王";
	void sayName() {
		System.out.println("我是老王");
	}
	static void methodStatic() {
		System.out.println("父类静态方法");
	}
}

class Son extends Father{
	String name = "小王";
	void sayName() {
		System.out.println("我是小王");
	}
	static void methodStatic() {
		System.out.println("子类静态方法");
	}
}
