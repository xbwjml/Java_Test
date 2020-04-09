package com.duoTai.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 09 - 16:22
 */
public class Demo3 {
    public static void main(String[] args) {
        Factory f = new Factory();
        f.createPhone(new MiNote());
        f.createPhone(new RedMi());
    }
}

class Factory{
    public void createPhone(Phone p){
        p.call();
    }
}

interface Phone{
    public void call();
}

class MiNote implements Phone{
    public void call(){
        System.out.println("小米note打电话");
    }
}

class RedMi implements Phone{
    public void call(){
        System.out.println("红米打电话");
    }
}