package com.designPattern.yuanze.dyzz;

/**
 * @author Leemi
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.run("汽车");
		vehicle.run("摩托车");
		vehicle.run("飞机");
	}
}

//交通工具类
//违反了单一职责原则，飞机不能再公路上跑
class Vehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"    在公路上跑");
	}
}
