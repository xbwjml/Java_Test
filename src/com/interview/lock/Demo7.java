package com.interview.lock;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Demo7 {
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(3);//模拟三个停车位
		
		for( int i=1; i<=6; i++ ) {//模拟6部汽车
			new Thread(()->{
				try {
					semaphore.acquire();//占有停车位
					System.out.println(Thread.currentThread().getName()+"\t 抢到车位");
					TimeUnit.SECONDS.sleep(3);//每辆车在车位上停3秒
					System.out.println(Thread.currentThread().getName()+"\t 离开车位");
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					semaphore.release();//释放停车位
				}
			},String.valueOf(i)).start();
		}
	}
}
