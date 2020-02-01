package com.sta.day01;

/**
 *  @author LeeMJ
 *  @Date 2020 - 02 - 01 - 21:05
 */
public class BlockDemo {
    public static void main(String[] args) {
        {
            //局部代码块，控制变量的生命周期(作用域)
            /*for (int i=0; i<10; i++){
                System.out.println("Hello"+i);
            }*/
            int num=10;
        }


        Teacher t = new Teacher();
        Teacher t2 = new Teacher("张三",20);

    }
}