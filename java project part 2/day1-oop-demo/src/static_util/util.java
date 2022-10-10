package static_util;

import java.util.Random;

public final class util {   //final 不能被继承

    private util(){
    }            //工具类无需出啊关键对象，所以可以将构造器私有化

    /*工具类*/
    /*静态方法*/
    public static String createVerifyCode(int n){
        //开发验证码
        Random r =new Random();
        String name = "";
        String mom = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < n; i++) {
            int m = r.nextInt(62);
            name += mom.charAt(m);
        }
        return name;
    }
}
