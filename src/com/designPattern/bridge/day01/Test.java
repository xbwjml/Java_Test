package com.designPattern.bridge.day01;

public class Test {
	public static void main(String[] args) {
		
		//获取手机(样式+品牌)
		
		//来一个小米的折叠式手机
		Phone phone1 = new FoldPhone(new Mi());
		phone1.open();
		phone1.close();
		phone1.call();
		System.out.println("===================");
		
		//来一个vivo的折叠手机
		FoldPhone phone2 = new FoldPhone(new Vivo());
		phone2.open();
		phone2.close();
		phone2.call();
		System.out.println("===================");
		
		//来一个小米的滑盖手机
		Phone phone3 = new SlidePhone(new Mi());
		phone3.open();
		phone3.close();
		phone3.call();
		System.out.println("===================");
		
		//来一个vivo的折叠式手机
		Phone phone4 = new SlidePhone(new Vivo());
		phone4.open();
		phone4.close();
		phone4.call();
		System.out.println("===================");
	}
}
