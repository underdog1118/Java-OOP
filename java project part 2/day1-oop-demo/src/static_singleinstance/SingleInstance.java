package static_singleinstance;

public class SingleInstance {
    /*2.饿汉单例是在获取对象前已经准备好了唯一一个对象*/
    public static SingleInstance s = new SingleInstance();
    public static int age = 21;

    /*1.必须私有化构造器*/
    private SingleInstance(){
    }
}
