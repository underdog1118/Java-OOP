package d2_package;

import d2_package.d2_package_son.Student; //导入student子包

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.同一个包下的类，可以互相访问
        System.out.println(User.onlineNumber);
        //2.不同包下的类，必须先导包再访问
        Student s = new Student();
        Scanner sc =new Scanner(System.in);
        //3.如果类中适用不同包下相同的类名，此时默认只能导入一个类中的包，另一个类要用全名访问

        d2_package.d2_package_son2.Student s2 = new d2_package.d2_package_son2.Student();//全名

    }
}
