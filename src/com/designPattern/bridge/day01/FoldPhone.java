package com.designPattern.bridge.day01;

/**
 * 折叠式手机
 * @author Leemi
 *
 */
public class FoldPhone extends Phone{

	//构造器
	public FoldPhone(Brand brand) {
		super(brand);
	}

	public void open() {
		System.out.println("折叠手机");
		super.open();
	}
	public void close() {
		System.out.println("折叠手机");
		super.close();
	}
	public void call() {
		System.out.println("折叠手机");
		super.call();
	}
}
