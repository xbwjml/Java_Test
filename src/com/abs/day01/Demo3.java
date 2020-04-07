package com.abs.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 07 - 17:53
 */
public class Demo3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}

abstract class Animalss{
    String name = "哮天犬";
    final int num = 10;
    public Animalss(){
        System.out.println("我是Animalss的无参构造");
    }
}

class Dog extends Animalss{
    public void bark(){
        System.out.println("我是"+name);
        System.out.println(num);
    }
}