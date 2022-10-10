package com.heima.create;

import java.util.Random;
import java.util.Scanner;

public class SuiJiPaiMing {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        System.out.println("enter the numbers");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<numbers.length;i++){
            numbers[i]= sc.nextInt();
        }

            Random r = new Random();
        for(int i = 0 ; i<numbers.length ; i++){
            int index = r.nextInt(numbers.length);
            int j = numbers[index];
            numbers[index]=numbers[i];
            numbers[i]=j;

        }
        for(int i = 0 ; i<5 ; i++) {
            System.out.println(numbers[i]);
        }

    }


}
