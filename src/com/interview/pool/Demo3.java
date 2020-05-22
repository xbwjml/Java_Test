package com.interview.pool;

import java.util.concurrent.TimeUnit;

/**
 * 死锁案例
 * 
 * @author Leemi
 *
 */

class HoldLockThread implements Runnable {
	private String lockA;
	private String lockB;

	public HoldLockThread(String lockA, String lockB) {
		this.lockA = lockA;
		this.lockB = lockB;
	}

	@Override
	public void run() {
		synchronized (lockA) {
			System.out.println(Thread.currentThread().getName() + "\t 自己持有：\t" + lockA + "\t尝试获得\t" + lockB);
			// 为了看得更清楚，暂停2秒
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (lockB) {
				System.out.println(Thread.currentThread().getName() + "\t 自己持有：\t" + lockB + "\t尝试获得\t" + lockA);
			}
		}
	}
}

public class Demo3 {
	public static void main(String[] args) {
		String lockA = "lockA";
		String lockB = "lockB";
		
		new Thread( new HoldLockThread(lockA, lockB), "Thread111" ).start();
		new Thread( new HoldLockThread(lockB, lockA), "Thread222" ).start();
	}
}
