package com.heima.type;

public class TD2 {
    public static void main(String[] args) {
        byte a =10;
        int b =20;
        double c =10.0;
        double d = a+b+c;
        System.out.println(d);

        byte i =10;
        byte j =20;
        int k = i+j; //不能用byte，因为表达式中的byte,short,char全部自动转换成Int

    }
}
