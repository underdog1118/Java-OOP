package String;

import java.util.Scanner;

public class StringExec2 {
    public static void main(String[] args) {
        //1.正确登录名和密码
        String okName = "underdog";
        String okPassword = "1118";
        //2.循环输入登录信息
        int count = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名： ");
            String name = sc.next();
            System.out.println("请输入密码： ");
            String password = sc.next();
            //3.判断
            if (name.equals(okName) && password.equals(okPassword)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("用户名或者密码错误,已错误"+(count+1)+"次");
                count++;
            }
            if (count == 3) {
                System.out.println();
                break;
            }
        }
    }
}
