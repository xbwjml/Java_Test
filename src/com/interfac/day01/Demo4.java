package com.interfac.day01;

public class Demo4 {
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		AAA aaa = new Test1();
		BBB bbb = new Test1();
		CCC ccc = new Test1();
	}
}

interface AAA{}
interface BBB{}
interface CCC{}

//一个类可以实现多个接口
class Test1 implements  AAA,BBB,CCC{}

//一个接口可以继承多个接口
interface ZZZ extends BBB,AAA,CCC{}

interface DDD{
	int a = 999;
	//java8开始，接口中可以有类方法(static 修饰)
	static String sayHello() {
		return "Heello World";
	}
	
	//java8开始，接口中可以有默认方法(default 修饰)
	default String sayHello2() {
		return "Heello World2";
	}
}

