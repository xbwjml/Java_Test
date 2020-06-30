package com.designPattern.produceConsume.day1;

public class Test {
	public static void main(String[] args) {
		Storage storage = new Storage();
		
//		 Thread producer1 = new Thread(new Producer(storage));
//		 Thread producer2 = new Thread(new Producer(storage));
//		 Thread producer3 = new Thread(new Producer(storage));
//		 
//		 Thread consumer1 = new Thread(new Consumer(storage));
//		 Thread consumer2 = new Thread(new Consumer(storage));
//		 Thread consumer3 = new Thread(new Consumer(storage));
		
		
		for( int i=0; i<3; i++ ) {
			new Thread(new Producer(storage)).start();
			new Thread(new Consumer(storage)).start();
		}
		
	}
}
