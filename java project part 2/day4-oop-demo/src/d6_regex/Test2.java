package d6_regex;



public class Test2 {
    public static void main(String[] args){

        //只能是a, b, c
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abc]"));

        //不能出现a,b,c
        System.out.println("a".matches("^[abc]"));
        System.out.println("z".matches("^[abc]"));

        System.out.println("a".matches("\\d"));  //false
        System.out.println("3".matches("\\d"));  //true
        System.out.println("333".matches("\\d"));//false \d只能用来判断单个字符
        System.out.println("z".matches("\\w"));  //true
        System.out.println("2".matches("\\w"));  //true
        System.out.println("333".matches("\\w"));//false


        System.out.println("--------------------");

        //必须是数字，字母，下划线， 至少6位
        System.out.println("ssd".matches("\\w{6,}"));
        System.out.println("ssdsss".matches("\\w{6,}"));
        System.out.println("ssdss你".matches("\\w{6,}"));

        System.out.println("----------------");

        //必须是数字和字符，必须4位
        System.out.println("21as".matches("[a-zA-Z0-9]{4}"));
        System.out.println("21as".matches("[\\w&&[^_]]{4}")); //数字，字符&& 非下划线


        System.out.println("21as".matches("[a-]"));



















































    }
}
