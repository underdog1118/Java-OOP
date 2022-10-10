package d4_polymorphic_case;

//public abstract class Usb {       //Usb为抽象父类，Keyboard和Mouse为子类
//    public abstract void In();    //抽象方法
//    public abstract void Out();
//}                                 //    子类改为extends继承


//也可以将Usb定义为接口
public interface Usb{
    void In();
    void Out();
}

