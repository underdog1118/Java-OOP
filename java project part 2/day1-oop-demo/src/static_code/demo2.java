package static_code;

public class demo2 {

    private String name;
    public demo2(){
        System.out.println("===无参构造器触发===");
    }

    /*实例代码块,属于对象，每次构件对象时触发一次*/
    //初始化实例资源
    {
        System.out.println("====实例代码块触发====");
        name = "张三";      //每次创建对象时都会命名为张三
    }

    public static void main(String[] args) {
        demo2 d1 = new demo2();
        demo2 d2 = new demo2();

    }
}
