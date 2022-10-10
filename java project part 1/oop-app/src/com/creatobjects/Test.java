package com.creatobjects;

public class Test {
    public static void main(String[] args) {
        //自己设计对象并使用
        //类名 对象名 = new 类名（）
        Car c = new Car();
//        System.out.println(c.name);    默认string为null
//        System.out.println(c.price);   默认double为0.0
        c.name="BMW";
        c.price = 30000.00;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();

        Car c2= new Car();
        c2.name = "Benz";
        c2.price = 400000.0;
        System.out.println(c2.name);
        System.out.println(c2.price);
        c2.start();
        c2.run();

        Car c3 = c2;
        System.out.println(c3.name);
        System.out.println(c3.price);
        c3.start();
        c3.run();
    }
}
