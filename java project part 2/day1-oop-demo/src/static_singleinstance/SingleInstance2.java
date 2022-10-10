package static_singleinstance;

public class SingleInstance2 {
    /*懒汉单例*/



    /*2.定义一个静态成员变量存储一个对象*/
    private static SingleInstance2 Instance ;
    /*3.提供方法对外返回单例对象*/
    public static SingleInstance2 getInstance(){
        if(Instance==null){
            Instance = new SingleInstance2();
        }
        return Instance;
    }

    /*1.私有化*/
    private SingleInstance2(){
    }

}
