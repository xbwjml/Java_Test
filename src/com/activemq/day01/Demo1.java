package com.activemq.day01;

/**
 * ThreadLocal: 
 * 		set(): 将变量绑定到当前线程中。
 * 		get(): 获取当前线程绑定的变量。
 *
 */
public class Demo1 {
	
	ThreadLocal<String> t1 = new ThreadLocal<>();
	
	private String content;

	public String getContent() {
//		return content;
		return t1.get();
	}

	public void setContent(String content) {
//		this.content = content;
		//变量绑定到当前线程
		t1.set(content);
	}
	
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		for( int i=0; i<5; i++ ) {
			Thread t = new Thread( new Runnable() {
				@Override
				public void run() {
					demo1.setContent(Thread.currentThread().getName()+"的数据");
					System.out.println("=================");
					System.out.println(Thread.currentThread().getName()+"====>"+demo1.getContent());
				}
			} );
			
			t.setName("线程"+i);
			t.start();
		}
	}
}
