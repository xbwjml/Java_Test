package com.designPattern.adapter.classAdapter;

//手机类
public class Phone {
	//充电
	public void charge(IV5V i) {
		if( i.outPut5V() == 5 ) {
			System.out.println("电压为5伏，可以正常充电");
		}else {
			System.out.println("电压不对，不能充电！！！！！！！！");
		}
	}
}
