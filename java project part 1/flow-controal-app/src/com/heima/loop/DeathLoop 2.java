package com.heima.loop;

import java.util.Scanner;

public class DeathLoop {
    public static void main(String[] args) {


    int okPass=250;
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("zheng que mi ma: ");
        int password = sc.nextInt();

        if(password == okPass){
            System.out.println("OK");
            break;
        }else{
            System.out.println("Wrong");
        }
    }
}
}
