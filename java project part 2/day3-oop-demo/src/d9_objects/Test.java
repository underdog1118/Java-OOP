package d9_objects;

import java.util.Objects;

/*
*   掌握objects中的equals
* */
public class Test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = new String("it");
//      System.out.println(s1.equals(s2));   //有隐患，万一s1/s2有null，会空指针异常

        System.out.println(Objects.equals(s1, s2));  //更安全，结果准确

        /* 源码 (ctrl+左键)
              public static boolean equals(Object a, Object b) {
                    return (a == b) || (a != null && a.equals(b));
              }
        */

        System.out.println(Objects.isNull(s1)); //true
        System.out.println(Objects.isNull(s2)); //false
    }
}
