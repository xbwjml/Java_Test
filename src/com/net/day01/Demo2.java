package com.net.day01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		
		//创建发送端Socket对象
		DatagramSocket ds = new DatagramSocket();
		
		//创建数据并打包
		String s = " I'm coming! ";
		byte[] bys = s.getBytes();
		int length = bys.length;
		InetAddress address = InetAddress.getByName("LAPTOP-903TEHP4");//发送给自己
		int port = 8888;
		//打包
		DatagramPacket dp = new DatagramPacket(bys, length,address,port);
		
		//发送数据
		ds.send(dp);
		
		//释放资源
		ds.close();
	}
}
