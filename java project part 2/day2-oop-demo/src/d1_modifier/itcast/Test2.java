package d1_modifier.itcast;

import d1_modifier.Super;

public class Test2  {
    public static void main(String[] args) {

        Super s = new Super();
        // s.privateMethod  //不行
        // s.method();      //不行
        // s.protectedMethod();  //不行
        s.publicMethod();
    }
}
