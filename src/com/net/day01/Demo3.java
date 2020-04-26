package com.net.day01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		
		//创建接收端对象
		DatagramSocket ds = new DatagramSocket(8888);
		
		//接收数据
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		ds.receive(dp);
		
		//解析数据
		InetAddress address = dp.getAddress();
		byte[] data = dp.getData();
		int length = dp.getLength();
		
		//输出数据
		System.out.println("发送端是："+address.getHostAddress());
		System.out.println(new String(data,0,length));
		
		
		//释放资源
		ds.close();
	}
}
