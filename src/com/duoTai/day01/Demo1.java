package com.duoTai.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 09 - 14:54
 */
public class Demo1 {
    public static void main(String[] args) {
        Dad d = new Son();
        System.out.println(d.age);
        d.method();
        d.function();
        Dad.function();

    }
}

class Dad{
    int age = 30;
    public void method(){
        System.out.println("父类方法");
    }
    public static void function(){
        System.out.println("父类静态方法");
    }
}

class Son extends Dad{
    int age = 10;
    public void method(){
        System.out.println("子类方法");
    }
    public static void function(){
        System.out.println("子类静态方法");
    }
}
