package com.designPattern.adapter.objectAdapter;

//被适配的类
public class Src220V {
	//提供220V电压
	public int output220V() {
		int src = 220;
		System.out.println("插座电压为： "+src);
		return src;
	}
}
