package com.designPattern.adapter.objectAdapter;

//手机类
public class Phome {

	public void charge(IV5V i) {
		if(i.output5V() == 5) {
			System.out.println("电压为5V，可以正常充电");
		}else {
			System.out.println("电压异常，不能充电");
		}
	}
}
