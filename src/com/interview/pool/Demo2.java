package com.interview.pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 自定义线程池
 * @author Leemi
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		
		int corePoolSize = 2;
		int maximumPoolSize = 5;
		long keepAliveTime = 1L;
		TimeUnit timeUnit = TimeUnit.SECONDS;
		BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<Runnable>(3);
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		RejectedExecutionHandler handler = new ThreadPoolExecutor.DiscardPolicy();
		
		ExecutorService threadPool = new ThreadPoolExecutor(corePoolSize, maximumPoolSize
										,keepAliveTime, timeUnit
										,workQueue
										,threadFactory
										,handler);
		
		try {
			//模拟10个用户，每个用户就是来自外部的请求
			for( int i=1; i<=20; i++ ){
				threadPool.execute( ()->{
					System.out.println(Thread.currentThread().getName()+"\t 办理业务");
				});
			}
		} catch( Exception e ) {
			e.printStackTrace();
		} finally {
			threadPool.shutdown();
		}
	}
}
