package com.designPattern.yuanze.lsth;

public class Demo2 {
	public static void main(String[] args) {
		AA aa = new AA();
		System.out.println("11-3 =  "+aa.fun1(11, 3));
		System.out.println("11-8 =  "+aa.fun1(11, 8));
		System.out.println("==========================");
		BB bb = new BB();
		System.out.println("11-3 =  "+bb.fun1(11, 3));
		System.out.println("11-8 =  "+bb.fun1(11, 8));
		System.out.println("11-3+9 = "+bb.fun2(11, 3));
	}
}

//创建一个个国家基础的类
abstract class Base{
	public abstract int fun1(int a, int b);
}

class AA extends Base{
	@Override
	public int fun1(int a, int b) {
		return a-b;
	}
}

class BB extends Base{
	//如果B类需要使用A类的方法，使用组合关系
	private AA aa = new AA();
	
	@Override
	public int fun1(int a, int b) {
		return a+b;
	}
	
	public int fun2(int a,int b) {
		return aa.fun1(a, b)+9;
	}

}
