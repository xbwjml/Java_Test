package com.interview.zsdl;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Demo1 {
	public static void main(String[] args) {
		
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
		
		System.out.println(blockingQueue.add("a"));
		System.out.println(blockingQueue.add("b"));
		System.out.println(blockingQueue.add("c"));
//		System.out.println(blockingQueue.add("d"));//满时再添加新元素会抛异常
		
		System.out.println(blockingQueue.element());//返回队首元素
		
		System.out.println(blockingQueue.remove());
		System.out.println(blockingQueue.remove());
		System.out.println(blockingQueue.remove());
//		System.out.println(blockingQueue.remove());//空了再移除元素会抛异常
		
		
		System.out.println(blockingQueue);
	}
}
