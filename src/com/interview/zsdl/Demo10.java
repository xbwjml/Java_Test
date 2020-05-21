package com.interview.zsdl;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class MyResource{
	private volatile boolean flag = true;//默认开启，进行生产+消费
	private AtomicInteger atomicIntegr = new AtomicInteger();
	BlockingQueue<String> blockingQueue = null;
	
	public MyResource(BlockingQueue<String> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}
	
	//生产
	public void myProd() throws Exception {
		String data = null;
		boolean retValue =false;
		while( flag ) {
			data = atomicIntegr.incrementAndGet()+"";
			retValue = blockingQueue.offer(data, 2L, TimeUnit.SECONDS);
			if(retValue) {
				System.out.println(Thread.currentThread().getName()+"\t 成功插入队列: \t"+data);
			}else {
				System.out.println(Thread.currentThread().getName()+"\t 没能插入队列: \t"+data);
			}
			TimeUnit.SECONDS.sleep(1);//为了看得清晰加的
		}
		System.out.println(Thread.currentThread().getName()+"叫停生产");
	}
	
	//消费
	public void myConsume() throws Exception {
		String result = null;
		while( flag ) {
			result = blockingQueue.poll(2L, TimeUnit.SECONDS);
			if( null==result || result.equalsIgnoreCase("") ) {
				flag = false;
				System.out.println(Thread.currentThread().getName()+"\t 超过2秒没有取到蛋糕，退出消费");
				System.out.println();
				return;
			}
			System.out.println(Thread.currentThread().getName()+"\t 成功消费队列元素：\t"+result);
		}
	}
	
	public void stop() {
		this.flag = false;
	}
}

public class Demo10 {
	public static void main(String[] args) {
		MyResource myResource = new MyResource(new ArrayBlockingQueue<>(10));
		
		new Thread( ()->{
			System.out.println(Thread.currentThread().getName()+"\t 生产线程启动");
			try {
				myResource.myProd();
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"Producer").start();
		
		new Thread( ()->{
			System.out.println(Thread.currentThread().getName()+"\t 消费线程启动");
			try {
				myResource.myConsume();
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"Consumer").start();
		
		//5秒后叫停
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("5秒后叫停");
		myResource.stop();
		
	}
}
