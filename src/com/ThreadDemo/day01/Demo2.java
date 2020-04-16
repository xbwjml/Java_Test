package com.ThreadDemo.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 15 - 15:38
 */
public class Demo2 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("xxx");
        mt2.setName("---");

        mt1.start();
        mt2.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println(getName()+":"+i);
        }
    }
}