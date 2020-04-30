package com.yangGe.JUC.day01;

import java.util.concurrent.TimeUnit;

class Phone {
	public static synchronized void sendSMS() throws Exception{
		TimeUnit.SECONDS.sleep(4);
		System.out.println("--------------sendSMS");
	}
	
	public  synchronized void sendEmail() throws Exception{
		System.out.println("--------------sendEmail");
	}
	
	public void openPhone() {
		System.out.println("--------------openPhone");
	}
}

public class Demo4 {
	public static void main(String[] args) throws Exception {
		Phone phone = new Phone();
		Phone phone2 = new Phone();
		
		new Thread(()->{
			try {
				phone.sendSMS();
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"AAA").start();
		
		Thread.sleep(100);
		
		new Thread(()->{
			try {
//				phone.sendEmail();
				phone.openPhone();
				phone2.sendEmail();
			} catch (Exception e) {
				e.printStackTrace();
			}
		},"BBB").start();
		
	}
}
