package com.designPattern.adapter.classAdapter;

//适配器类，将220V转换成5V
public class Adapter extends Src220V implements IV5V{
	@Override
	public int outPut5V() {
		//首先获取到电源电压
		int src = outPut220();
		int result = src/44;//转成5伏
		return result;
	}
}
