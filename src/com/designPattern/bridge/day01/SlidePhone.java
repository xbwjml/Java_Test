package com.designPattern.bridge.day01;

public class SlidePhone extends Phone{

	public SlidePhone(Brand brand) {
		super(brand);
	}
	
	public void open() {
		System.out.println("滑盖手机");
		super.open();
	}
	public void close() {
		System.out.println("滑盖手机");
		super.close();
	}
	public void call() {
		System.out.println("滑盖手机");
		super.call();
	}

}
