package com.java8New.optional;

import java.util.Optional;

import org.junit.Test;

/**
 * 
 *
 */
public class Demo1 {
	
	@Test
	public void test1() {
		Optional<Student> opt = Optional.of(new Student());
//		Optional<Student> opt = Optional.of(null);
		Student stu = opt.get();
		System.out.println(stu);
	}
	
	@Test
	public void test2() {
		Optional<Object> empty = Optional.empty();
		System.out.println(empty.get());
	}
	
	@Test
	public void test3() {
		Optional<Student> opt = Optional.ofNullable(null);
		if( opt.isPresent() ) {
			System.out.println(opt.get());
		}
		Student stu = opt.orElse(new Student("张三",18));
		System.out.println(stu);
	}
	
}
