package com.yangGe.JUC.day01;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("********call()************");
		return 200;
	}
	
}

public class Demo7 {
	public static void main(String[] args) throws Exception {
		FutureTask<Integer> ft = new FutureTask<Integer>(new MyThread());
		new Thread(ft,"AA").start();
		
		Integer result01 = ft.get();
		Integer result02 = ft.get();
		System.out.println("result01: "+result01);
		System.out.println("result02: "+result02);
		
	}
}