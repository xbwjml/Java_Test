package com.interview.lock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Demo6 {
	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(7, ()->{System.out.println("***召唤神龙");});
		
		for( int i=1; i<=7; i++ ) {
			final int temp = i;
			new Thread( ()->{
				System.out.println(Thread.currentThread().getName()+"收集到第\t "+temp+" \t颗龙珠");
				try {
					cyclicBarrier.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					e.printStackTrace();
				}
			},String.valueOf(i)).start();
		}
		
	}
}
