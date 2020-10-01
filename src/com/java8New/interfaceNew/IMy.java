package com.java8New.interfaceNew;

public interface IMy {
	
	//用default修饰的默认实例方法,子类可以不重写这个方法
	//若和类中的方法一样(方法名和参数列表),则类中的方法优先
	//若一个类实现了多个接口，这多个接口有相同的默认方法，则这个类必须重写这个方法
	default String getName() {
		return "哈哈哈";
	}
	
	//静态方法,直接用接口名调用
	public static void staMethod() {
		System.out.println("接口中的静态方法");
	}

}

