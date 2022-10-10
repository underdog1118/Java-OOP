package d6_regex;

public class test1 {
    public static void main(String[] args) {
        //验证qq
        System.out.println(checkQQ("312423432"));
        System.out.println(checkQQ("32423as"));

        System.out.println(checkQQ2("324234"));

    }

    public static boolean checkQQ2(String qq){
        return  qq != null && qq.matches("\\d{6,20}"); //正则表达式
    }


    public static boolean checkQQ(String qq) {
        //1。验证长度
        if (qq == null || qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        //2.验证是否全部数字
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            if (ch < '0' || ch  > '9') {
                return false;
            }
           }
        return true;


    }
}

