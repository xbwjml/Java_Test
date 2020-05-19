package com.interview.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读-读	能共存
 * 读-写	不能共存
 * 写-写	不能共存
 * @author Leemi
 *
 */
public class Demo4 {
	public static void main(String[] args) {
		MyCache myCache = new MyCache();
		
		for( int i=1; i<=5; i++ ) {
			final int tempInt = i;
			new Thread( ()->{
				myCache.put(tempInt+"", tempInt+"");
			},String.valueOf(i)).start();
		}
		
		for( int i=1; i<=5; i++ ) {
			final int tempInt = i;
			new Thread( ()->{
				myCache.get(tempInt+"");
			},String.valueOf(i)).start();
		}
		
	}
}

class MyCache{
	private volatile Map<String,Object> map = new HashMap<>();
	private ReentrantReadWriteLock rwLock =  new ReentrantReadWriteLock();
	
	public void put( String key, Object value ) {
		rwLock.writeLock().lock();
		try {
			System.out.println(Thread.currentThread().getName()+"正准备写入:\t "+key);
			try {TimeUnit.MICROSECONDS.sleep(300);} 
			catch (InterruptedException e) {e.printStackTrace();}
			map.put(key, value);
			System.out.println(Thread.currentThread().getName()+"写入完成");
		} finally {
			rwLock.writeLock().unlock();
		}
	}
	
	public void get( String key )  {
		rwLock.readLock().lock();
		try {
			System.out.println(Thread.currentThread().getName()+"正准备读 ");
			try {TimeUnit.MICROSECONDS.sleep(300);} 
			catch (InterruptedException e) {e.printStackTrace();}
			Object result = map.get(key);
			System.out.println(Thread.currentThread().getName()+"读取完成"+result);
		} finally {
			rwLock.readLock().unlock();
		}
	}
}
