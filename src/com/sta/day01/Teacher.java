package com.sta.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 02 - 01 - 22:18
 */
public class Teacher {
    private String name;
    private int age;

    //构造代码块,提取构造方法中的共性,每次创建对象都会执行，并且在构造方法执行之前执行
    {
        for (int i=0; i<5; i++){
            System.out.println("Hello"+i);
        }
    }

    //静态代码块,随着类的加载而加载，只加载一次
    static {
        System.out.println("静态代码块");
    }


    public Teacher() {
        System.out.println("无参构造");

    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
