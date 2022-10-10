package _static;

public class demo2 {
    /*静态成员变量和静态方法*/
    public static int onlineNumber = 110;
    public static void test2(){
        System.out.println("===test2===");
    }

    /*实例成员变量和实例方法*/
    private String name;
    public void run(){
        System.out.println(name+" is running");
    }


    //3.静态方法中不可出现this，this代表当前对象地址,静态方法可以不用对象调用
    public static void test3(){
//        System.out.println(this);

    }
    //2.实例方法可以访问实例成员， 也能访问静态成员
    public void go(){
        System.out.println(onlineNumber);
        System.out.println(demo2.onlineNumber);
        test2();
        this.name = "ads";
        System.out.println(name);
        run();
    }
    //1.静态方法只能访问静态成员，不能 直接 访问实例成员
    public static void test(){
        System.out.println(demo2.onlineNumber);
        System.out.println(onlineNumber);
        test2();
//       run();
//       System.out.println(name);
        
        demo2 d = new demo2();
        d.name = "cs37";
        System.out.println(d.name);
        d.run();
    }

    public static void main(String[] args) {
        test();
        demo2 d = new demo2();
        d.go();
    }
}
