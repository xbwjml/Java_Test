package com.designPattern.proxy.staticc;

//被代理的类(委托类)
public class TeacherImpl implements ITeacherDao{

	@Override
	public void teach() {
		System.out.println("老师授课中");
	}

}
