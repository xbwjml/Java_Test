package com.designPattern.adapter.classAdapter;

//220V电源
public class Src220V {
	//输出220伏的电压
	public int outPut220() {
		int src = 220;
		System.out.println("插座电压 = "+src);
		return src;
	}
}
