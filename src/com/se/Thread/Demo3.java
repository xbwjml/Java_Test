package com.se.Thread;

import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		Demo3 test = new Demo3();
		MyThread thread = test.new MyThread();
		thread.start();
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {

		}
		thread.interrupt();
	}

	class MyThread extends Thread {
		@Override
		public void run() {
			int i = 1;
			while (i < Integer.MAX_VALUE) {
				System.out.println(i + " while循环");
				i++;
			}
		}
	}
	
}
