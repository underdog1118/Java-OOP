package com.heima.create;
import javax.sound.midi.SysexMessage;
import java.util.Random;
import java.util.Scanner;


public class CaiShuZi {
    public static void main(String[] args) {
        Random r = new Random();
        int[] choose = new int[5];
        for(int i=0; i<5; i++){
            int numbers = r.nextInt(1,21);
            choose[i]=numbers;
        }
//        int m=1;

        Scanner sc = new Scanner(System.in);
        OUT:
        do {
            System.out.println("请输入猜测数字: ");
            int guess = sc.nextInt();
            for (int j = 0; j < 5; j++) {
                if (choose[j] == guess) {
                    System.out.println("正确！答案位置是： "+j);
//                  m=0;
                    break OUT;
                }
                else
                    continue;
            }
//            if(m==1)
                System.out.println("错误 再试一次");
        }while(true);  // while(m==1);

        for(int i=0;i<5;i++) {
            System.out.println(choose[i]);
        }
    }
}

