package com.interview.volatilee;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 2，验证volatile不保证原子性
 * @author Leemi
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		MyData2 myData2 = new MyData2();
		
		for( int i=0; i<20; i++ ) {
			new Thread( ()->{
				for( int j=0; j<1000; j++ ) {
					myData2.addPP();
					myData2.addMyAtomic();
				}
			},String.valueOf(i) ).start();
		}
		
		//等待上面20歌线程结束后，main线程再看看num的最终值是多少
		while (Thread.activeCount() >2) {
			Thread.yield();
		}
		
		System.out.println(Thread.currentThread().getName()+"\t finally num is:"+myData2.num);
		System.out.println(Thread.currentThread().getName()+"\t finally atomicInteger is:"+myData2.atomicInteger);
		
	}
}

class MyData2 {
	volatile int num = 0;

	public void addTo60() {
		this.num = 60;
	}
	
	public void addPP() {
		this.num++;
	}
	
	AtomicInteger atomicInteger = new AtomicInteger();
	
	public void addMyAtomic() {
		atomicInteger.getAndIncrement();
	}
}
