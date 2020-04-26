package com.net.day01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getByName("LAPTOP-903TEHP4");
		System.out.println(address);
		
		System.out.println(address.getHostAddress());
		System.out.println(address.getHostName());
	}
}
