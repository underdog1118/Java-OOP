package _static;

public class demo1 {
    public static void main(String[] args) {

        System.out.println(User.onlineNumber);  //常用

        User u = new User();                    //不推荐
        u.onlineNumber++;
        System.out.println(u.onlineNumber);

    }
}
