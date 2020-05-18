package com.interview.CAS;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo1 {
	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger(5);
		System.out.println(atomicInteger.compareAndSet(5, 2019) + "\t current data: "+atomicInteger.get());
		System.out.println(atomicInteger.compareAndSet(5, 1024) + "\t current data: "+atomicInteger.get());
		
		atomicInteger.getAndIncrement();
	}
}
