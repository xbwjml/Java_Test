package com.designPattern.proxy.jdk.day01;

public class Test {
	public static void main(String[] args) {
		
		//创建目标对象
		ITeacherDao iteacherDao = new TeacherDaoImpl();
		
		//给目标对象创建代理对象
		ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(iteacherDao).getProxyInstance();
		
		System.out.println("proxyInstance = : "+proxyInstance);
		System.out.println("proxyInstance = : "+proxyInstance.getClass());
		
		proxyInstance.teach();
	}
}
