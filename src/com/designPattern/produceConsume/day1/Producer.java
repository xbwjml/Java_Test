package com.designPattern.produceConsume.day1;

public class Producer implements Runnable{
	private Storage storage;
	public Producer(Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				storage.prodece();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
