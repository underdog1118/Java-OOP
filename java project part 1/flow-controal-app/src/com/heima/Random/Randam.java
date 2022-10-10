package com.heima.Random;
import java.util.Random;

public class Randam {
    public static void main(String[] args) {

        Random r = new Random();
        for(int i=0;i<20;i++){
            int data = r.nextInt(2,14); //随机从2到13取数字 origin包含 bound不包含
            System.out.println(data);
        }


    }
}
