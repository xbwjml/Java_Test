package com.designPattern.bridge.day01;

/**
 * 小米类实现Brand接口
 * @author Leemi
 *
 */
public class Mi implements Brand{

	@Override
	public void open() {
		System.out.println("小米	开机");
	}

	@Override
	public void close() {
		System.out.println("小米	关机");
	}

	@Override
	public void call() {
		System.out.println("小米	打电话");
	}

}
