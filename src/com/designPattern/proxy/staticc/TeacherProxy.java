package com.designPattern.proxy.staticc;

//代理类
public class TeacherProxy implements ITeacherDao{

	private ITeacherDao target;
	
	public TeacherProxy(ITeacherDao target) {
		this.target = target;
	}
	
	@Override
	public void teach() {
		System.out.println("代理开始");
		target.teach();
		System.out.println("代理结束");
	}

}
