package d8_interface;
/*
    声明了一个接口:体现一种规范，规范一定是公开的
* */
public interface InterfaceDemo {
    //接口成分特点： JDK8之前 接口中只能有 抽象方法和 常量
    public static final String SCHOOL_NAME = "黑马";
    public abstract void run();

    //因为接口是公开的，public static可以省略不写
    final String A = "撒";
    void eat();
}
