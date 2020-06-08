package com.designPattern.yuanze.dyzz;
/**
 * 
 * @author Leemi
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		new RoadVehicle().run("摩托车");
		new AirVehicle().run("波音747");
		new WaterVehicle().run("航母");
	}
}

//遵守了单一职责原则，但是改动较大，类太多

//路上跑的交通工具
class RoadVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"    在公路上跑");
	}
}

//空中交通工具
class AirVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"    在天上飞");
	}
}

//水中交通工具
class WaterVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"    在水上运行");
	}
}