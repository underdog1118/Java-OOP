package _static;

public class User {
    public static int onlineNumber = 161;  //静态成员变量

    private String name;   //实例成员变量
    private int age;

    public static void main(String[] args) {
        System.out.println(User.onlineNumber);

        User u = new User();
        u.name = "zhangsan";
        u.age = 16;
        u.onlineNumber++;
        System.out.println(u.onlineNumber);
        System.out.println(u.name);
        System.out.println(u.age);

        User u2 = new User();
        u2.name = "lisui";
        u2.age = 20;
        u.onlineNumber++;
        System.out.println(u.onlineNumber);
        System.out.println(u2.name);
        System.out.println(u2  .age);
    }
}
