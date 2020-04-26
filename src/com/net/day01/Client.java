package com.net.day01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//创建发送端 Socket对象,(创建连接)
		Socket s = new Socket(InetAddress.getByName("LAPTOP-903TEHP4"),10086);
		
		//创建输出流对象
		OutputStream os = s.getOutputStream();
		
		//发送数据
		os.write("tcp coming!".getBytes());
		
		//释放资源
		os.close();
		s.close();
	}
}
