package d8_api_object;

import java.util.Objects;

/*
    //学习equals
* */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("JOJO",'男',18);
        Student s2 = new Student("JOJO",'男',18);
        System.out.println(s1==s2); //false 比较地址
        System.out.println(s1.equals(s2));  //true 自己重写后比较
        System.out.println(s1.equals2(s2)); //自动补全的重写equals

        System.out.println(Objects.equals(s1, s2)); //Objects的equals
    }
}
