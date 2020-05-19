package com.interview.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo1 {
	
	volatile int n=0;
	
	public void add() {
		n++;
	}
	
	public static void main(String[] args) {
		Lock lock = new ReentrantLock(true);
	}
}
