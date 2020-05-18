package com.interview.CAS;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * ABA问题解决
 * @author Leemi
 *
 */
public class Demo3 {
	
	static AtomicReference<Integer> atomicReference = new AtomicReference<>(100);
	static AtomicStampedReference<Integer> atomicStampReference= new AtomicStampedReference<>(100,1);
	
	public static void main(String[] args) {
		
		System.out.println("===============以下是ABA问题的产生================");
		new Thread( ()->{
			atomicReference.compareAndSet(100, 101);
			atomicReference.compareAndSet(101, 100);
		},"t1").start();
		
		new Thread( ()->{
			//t2线程暂停1秒，确保t1线程完成了一次ABA
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(atomicReference.weakCompareAndSet(100, 2019)+"\t :"+atomicReference.get());
		}).start();
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("===============以下是ABA问题的解决================");
		new Thread( ()->{
			int stamp = atomicStampReference.getStamp();
			System.out.println(Thread.currentThread().getName()+"\t 第一次版本号："+stamp);
			//t3进程暂停1秒，
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			atomicStampReference.compareAndSet(100, 101, atomicStampReference.getStamp(), atomicStampReference.getStamp()+1);
			System.out.println(Thread.currentThread().getName()+"\t 第二次版本号："+atomicStampReference.getStamp());
			atomicStampReference.compareAndSet(101, 100, atomicStampReference.getStamp(), atomicStampReference.getStamp()+1);
			System.out.println(Thread.currentThread().getName()+"\t 第三次版本号："+atomicStampReference.getStamp());
		},"t3").start();
		
		new Thread( ()->{
			int stamp = atomicStampReference.getStamp();
			System.out.println(Thread.currentThread().getName()+"\t 第一次版本号："+stamp);
			//t4进程暂停3秒，保证t3线程完成一次ABA
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			boolean flag = atomicStampReference.compareAndSet(100, 2019, stamp, stamp+1);
			System.out.println(Thread.currentThread().getName()+"\t "+flag+"\t 当前版本号："+atomicStampReference.getStamp());
			System.out.println(Thread.currentThread().getName()+"\t 当前最新值s："+atomicStampReference.getReference());
		},"t4").start();
		
	}
}
