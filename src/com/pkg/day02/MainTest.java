package com.pkg.day02;


import com.pkg.day01.Demo1;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 09 - 19:58
 */
public class MainTest extends Demo1{


    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        int i1 = d1.numPublic;
    }

    int i2 = super.numProtected;
}
