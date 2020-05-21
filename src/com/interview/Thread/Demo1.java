package com.interview.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("***********come ine Callable");
		return 1024;
	}
	
}

public class Demo1 {
	public static void main(String[] args) throws Exception {
		FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
		
		Thread t1 = new Thread(futureTask);
		t1.start();
		
		System.out.println("####### result :"+futureTask.get());
	}
}
