package com.designPattern.adapter.interfaceAdapter;

public class Test {
	public static void main(String[] args) {
		
		Adapter adapter = new Adapter() {
			//我们根据需求有选择性地重写方法
			@Override
			public void operation1() {
				System.out.println("使用了 operation1()");
			}
		};
		
		adapter.operation1();
	}
}
