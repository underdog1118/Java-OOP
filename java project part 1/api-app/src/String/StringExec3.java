package String;

import java.util.Scanner;

public class StringExec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号： ");
        String number = sc.next();
/*        for (int i = 0; i < 11; i++) {
            int c = sc.nextInt();
            number += char(c);
        }*/
      //  System.out.println(number);
        String n1 = number.substring(0,3);
        String n2 = number.substring(7,11);

        String n3 = n1+"****"+n2;
        System.out.println(n3);


    }
}
