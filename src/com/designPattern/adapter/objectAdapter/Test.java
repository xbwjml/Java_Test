package com.designPattern.adapter.objectAdapter;

//测试
public class Test {
	public static void main(String[] args) {
		System.out.println("===对象适配器===");
		Phome p = new Phome();
		p.charge(new Adapter(new Src220V()));
	}
}
