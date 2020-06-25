package com.designPattern.proxy.staticc;

public class Test {
	public static void main(String[] args) {
		
		//先创建目标对象(被代理者)
		ITeacherDao target = new TeacherImpl();
		
		//创建代理对象
		TeacherProxy proxy = new TeacherProxy(target);
		
		//通过代理对象，调用被代理对象的方法
		proxy.teach();
	}
}
