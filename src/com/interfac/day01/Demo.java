package com.interfac.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 07 - 19:46
 */
public class Demo {
    public static void main(String[] args) {
        int a = Animal.num;
    }
}

interface Animal{
    public static final int num = 1;
    void eat();
}

class Cat implements Animal{

    @Override
    public void eat() {

    }
}