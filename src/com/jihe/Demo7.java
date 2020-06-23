package com.jihe;

import java.util.HashSet;
import java.util.Set;

public class Demo7 {
	public static void main(String[] args) {
		Set<Studentt> set = new HashSet<>();
		set.add(new Studentt("张三",18));
		set.add(new Studentt("里斯",19));
		set.add(new Studentt("里斯",19));
		
		for( Studentt s : set ) {
			System.out.println(s);
		}
		
	}
}

class Studentt{
	String name;
	int age;
	public Studentt(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Studentt [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studentt other = (Studentt) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}