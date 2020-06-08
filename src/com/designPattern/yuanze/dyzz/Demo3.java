package com.designPattern.yuanze.dyzz;

/**
 * 
 * @author Leemi
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		Vehicle2 vehicle2 = new Vehicle2();
		vehicle2.run("汽车");
		vehicle2.fly("飞艇");
		vehicle2.swim("帆船");
	}
}

//没有增加新的类，只是对原来的类修改;
//这次虽然没有在类级别上遵单一职责原则,但是在方法级别上遵守亿职责原则
class Vehicle2{
	public void run(String vehicle) {
		System.out.println(vehicle+"    在公路上跑");
	}
	public void fly(String vehicle) {
		System.out.println(vehicle+"    在空中飞");
	}
	public void swim(String vehicle) {
		System.out.println(vehicle+"    在水上运行");
	}
}