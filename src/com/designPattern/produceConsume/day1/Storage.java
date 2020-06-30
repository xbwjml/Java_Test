package com.designPattern.produceConsume.day1;

import java.util.ArrayList;
import java.util.List;

public class Storage {

	//仓库容量
	private final int MAX_SIZE  = 10;
	
	//仓库存储的载体
	private List<Object> list = new ArrayList<>();
	
	//生产方法
	public void prodece() throws InterruptedException {
		synchronized (list) {
			while( list.size()+1 > MAX_SIZE ) {
				System.out.println("仓库已满, 生产者： "+Thread.currentThread().getName()+" 等待");
				list.wait();
			}
			list.add(new Object());
			System.out.println("生产者： "+Thread.currentThread().getName()+"生产了一个产品，现库存： "+list.size());
			list.notifyAll();
		}
	}
	
	//消费方法
	public void consume() throws InterruptedException {
		synchronized (list) {
			while( list.size() == 0 ) {
				System.out.println("仓库已空，消费者： "+Thread.currentThread().getName()+" 等待");
				list.wait();
			}
			list.remove(0);
			System.out.println("消费者： "+Thread.currentThread().getName()+"消费了一个产品，现库存： "+list.size());
			list.notifyAll();
		}
	}
}
