package String;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        //1.正确登录名和密码
        String okName = "underdog";
        String okPassword = "1118";
        //2.输入登录信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名： ");
        String name = sc.next();
        System.out.println("请输入密码： ");
        String password = sc.next();
        //3.判断
        if(name.equals(okName) && password.equals(okPassword)){
            System.out.println("登陆成功");
        }
        else
            System.out.println("用户名或者密码错误");

        //4.忽略大小写比较内容的api equalsIgnoreCase()
        String s1 = "234AS";
        String s2 = "234as";
        System.out.println(s1.equalsIgnoreCase(s2));


    }
}
