package static_code;

import java.util.ArrayList;

public class demo1 {

    public static String schoolName;
    public static ArrayList<String> cards = new ArrayList<>();

    /*静态代码块，属于类，优先加载一次，自动触发执行*/
    //用于初始化静态资源
    static{
        System.out.println("静态代码块执行");
        schoolName = "黑马";
        cards.add("3");
    }

    public static void main(String[] args) {
        System.out.println("main方法执行");
        System.out.println(schoolName);
        System.out.println(cards );
    }
}
