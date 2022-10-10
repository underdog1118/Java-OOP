package d1_modifier.itcast;

import d1_modifier.Super;

public class Sub extends Super {
    public static void main(String[] args) {
        Sub s = new Sub();   //要用子类构造，不能再用父类，否则无法使用protectedMethod
        // s.privateMethod  //不行
        // s.method();      //不行
        s.protectedMethod();
        s.publicMethod();
    }
}
