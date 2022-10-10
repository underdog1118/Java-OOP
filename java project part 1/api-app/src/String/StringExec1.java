package String;

import java.util.Random;

public class StringExec1 {
    public static void main(String[] args) {
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String ver = "";
        Random r =new Random();
        for (int i = 0; i < 5; i++) {
            int j = r.nextInt(0,63);
            char c = a.charAt(j);
            ver += c;
        }
        System.out.println(ver);
    }
}
