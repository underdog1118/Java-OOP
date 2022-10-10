package com.heima.Random;
import java.util.Random;
import java.util.Scanner;

public class caishuzi {
    public static void main(String[] args) {

        Random r = new Random();
        int data = r.nextInt(5)+1;

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("Type(1~5): ");
            int guessNumber = s.nextInt();

            if (guessNumber>data){
                System.out.println("Big");
//                continue;
            }
            else if(guessNumber<data){
                System.out.println("Small");
//                continue;
            }
            else {
                System.out.println("YES");
                break;
            }

        }

    }
}
