package com.designPattern.bridge.day01;

/**
 * 手机抽象类
 * @author Leemi
 *
 */
public abstract class Phone {
	
	private Brand brand;
	
	//构造器
	public Phone(Brand brand) {
		this.brand = brand;
	}

	protected void open() {
		this.brand.open();
	}

	protected void close() {
		this.brand.close();
	}

	protected void call() {
		this.brand.call();
	}

}
