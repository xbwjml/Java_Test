package com.jihe;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 23 - 15:11
 */
public class Demo4 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        set.add(new Student("张三",18));
        set.add(new Student("王五",20));
        set.add(new Student("王五",20));

        for ( Student s : set ){
            System.out.println(s);
        }
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("开始用equals()方法进行比较");
        Student s = (Student) o;
        if( this.age != s.age ){
            return false;
        }
        if( !this.name.equals(s.name) ){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        System.out.println("开使用hashCode()方法进行比较");
        return 1;
    }
}
