package com.designPattern.bridge.day01;

/**
 * Vivo类实现Brand接口
 * @author Leemi
 *
 */
public class Vivo implements Brand{

	@Override
	public void open() {
		System.out.println("Vivo	开机");
	}

	@Override
	public void close() {
		System.out.println("Vivo	关机");
	}

	@Override
	public void call() {
		System.out.println("Vivo	打电话");
	}

}
