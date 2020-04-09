package com.interfac.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 07 - 20:30
 */
public class Demo2 {
    public static void main(String[] args) {
        String s = "test";
    }
}

interface A {
    public void methodA();
}

interface B{
    public void methodB();
}

interface C extends A,B{}

class Test implements C{

    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }
}


