package com.duoTai.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 09 - 15:52
 */
public class Demo2 {
    public static void main(String[] args) {
        Animal a = new Dog();//这就是向上转型
//        a.eat();
        Dog d = (Dog)a;
        d.eat();
        d.swim();
    }
}

class Animal{
    public void eat(){
        System.out.println("吃东西");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void swim(){
        System.out.println("狗刨式游泳");
    }
}