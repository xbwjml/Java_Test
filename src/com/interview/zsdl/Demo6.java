package com.interview.zsdl;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Demo6 {
	public static void main(String[] args) throws Exception {
		
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
		
		System.out.println(blockingQueue.offer("a", 2L, TimeUnit.SECONDS));;
		System.out.println(blockingQueue.offer("b", 2L, TimeUnit.SECONDS));;
		System.out.println(blockingQueue.offer("c", 2L, TimeUnit.SECONDS));;
		System.out.println("===========================");
		System.out.println(blockingQueue.offer("d", 2L, TimeUnit.SECONDS));;
		
		System.out.println(blockingQueue.poll(2L, TimeUnit.SECONDS));
		System.out.println(blockingQueue.poll(2L, TimeUnit.SECONDS));
		System.out.println(blockingQueue.poll(2L, TimeUnit.SECONDS));
		System.out.println("===========================");
		System.out.println(blockingQueue.poll(2L, TimeUnit.SECONDS));
		
		
		System.out.println(blockingQueue);
	}
}
