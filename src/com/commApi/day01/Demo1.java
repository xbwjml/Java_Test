package com.commApi.day01;

import java.util.Objects;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 10 - 10:24
 */
public class Demo1 {
    public static void main(String[] args) {
        Student s = new Student("张三",20);
        System.out.println(s.toString());
        System.out.println(s);
    }
}

class Student{
    String name;
    int age;

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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
