package com.designPattern.proxy.jdk.day01;

public class TeacherDaoImpl implements ITeacherDao{

	@Override
	public void teach() {
		System.out.println("老师授课中");
	}

}
