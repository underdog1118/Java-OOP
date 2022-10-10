package com.creatobjects;

public class Car {
    //属性（成员变量）
    String name;
    double price;
    //行为（方法）
    public void start(){
        System.out.println(name+", price is : "+price+" , starts~~");
    }
    public void run(){
        System.out.println(name+", price is : "+price+" , runs fast");
    }

}

