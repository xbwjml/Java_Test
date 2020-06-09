package com.designPattern.yuanze.lsth;

public class Demo1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println("11-3 =  "+a.fun1(11, 3));
		System.out.println("11-8 =  "+a.fun1(11, 8));
		System.out.println("==========================");
		B b = new B();
		System.out.println("11-3 =  "+b.fun1(11, 3));
		System.out.println("11-8 =  "+b.fun1(11, 8));
		System.out.println("11-3+9 = "+b.fun2(11, 3));
	}
}

class A{
	public int fun1( int a, int b ) {
		return a-b;
	}
}

class B extends A{
	@Override //重写了父类的fun1(int a, int b)
	public int fun1( int a, int b ) {
		return a+b;
	}
	
	public int fun2(int a,int b) {
		return fun1(a,b)+9;
	}
}
