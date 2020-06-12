package com.designPattern.adapter.objectAdapter;


//适配器类
public class Adapter implements IV5V{
	
	private Src220V src220V;
	
	public Adapter(Src220V src220V) {
		this.src220V = src220V;
	}

	@Override
	public int output5V() {
		int res = 0;
		if( null!=src220V ) {
			//获取插座的220V电压
			int src = src220V.output220V();
			res = src/44;
		}
		return res;
	}
	
}
