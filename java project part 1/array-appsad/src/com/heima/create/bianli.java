package com.heima.create;

public class bianli {
    public static void main(String[] args) {

        int[] money = new int[]{324,5,3452,53,55};  /*  static
        int[] money = new int[5]   dynamic
        */
        int sum = 0;
        for(int i = 0; i<money.length;i++){
            sum += money[i];

        }
        System.out.println("sum is "+sum);



    }
}
