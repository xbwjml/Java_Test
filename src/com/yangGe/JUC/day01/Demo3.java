package com.yangGe.JUC.day01;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 20 - 13:01
 */
public class Demo3 {
    public static void main(String[] args) {
        ShareData sd = new ShareData();

        new Thread( ()->{ for(int i=0;i<10;i++){
            try {
                sd.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } },"AAA" ).start();

        new Thread( ()->{ for(int i=0;i<10;i++){
            try {
                sd.decrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } },"BBB" ).start();

        new Thread( ()->{ for(int i=0;i<10;i++){
            try {
                sd.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } },"CCC" ).start();

        new Thread( ()->{ for(int i=0;i<10;i++){
            try {
                sd.decrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } },"DDD" ).start();

    }
}

class ShareData{
    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() throws InterruptedException{
        lock.lock();
        try{
            while( number!=0 ){
//            this.wait();
            condition.await();
        }
        //2.干活
        ++number;
        System.out.println(Thread.currentThread().getName()+" : "+number);
        //3.通知
//        this.notifyAll();
        condition.signalAll();
        }catch ( Exception e ){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decrement() throws InterruptedException{
        lock.lock();
        try{
            while( number==0 ){
//            this.wait();
            condition.await();
        }
        //2.干活
        --number;
        System.out.println(Thread.currentThread().getName()+" : "+number);
        //3.通知
//        this.notifyAll();
        condition.signalAll();
        }catch ( Exception e ){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

//    public synchronized void increment() throws InterruptedException {
//        //1.判断
//        while( number!=0 ){
//            this.wait();
//        }
//        //2.干活
//        ++number;
//        System.out.println(Thread.currentThread().getName()+" : "+number);
//        //3.通知
//        this.notifyAll();
//    }
//
//    public synchronized void decrement() throws InterruptedException {
//        //1.判断
//        while( number==0 ){
//            this.wait();
//        }
//        //2.干活
//        --number;
//        System.out.println(Thread.currentThread().getName()+" : "+number);
//        //3.通知
//        this.notifyAll();
//    }
}
