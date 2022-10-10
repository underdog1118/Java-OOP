package static_util;

import java.util.Random;

public class Login {
    public static void main(String[] args) {
        //开发验证码
        Random r =new Random();
        String name = "";
        String mom = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < 5; i++) {
            int m = r.nextInt(62);
            name += mom.charAt(m);
        }
        System.out.println(name);
    }
}
