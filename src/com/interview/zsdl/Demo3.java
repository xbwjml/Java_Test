package com.interview.zsdl;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo3 {
	public static void main(String[] args) throws Exception {
		
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
		
		blockingQueue.put("a");
		blockingQueue.put("b");
		blockingQueue.put("c");
		System.out.println("=============");
//		blockingQueue.put("d");
		
		blockingQueue.take();
		blockingQueue.take();
		blockingQueue.take();
		System.out.println("=============");
//		blockingQueue.take();
		
		System.out.println(blockingQueue);
	}
}
