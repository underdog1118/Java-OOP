package static_singleinstance;

public class Test1 {
    //饿汉单例


    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.s;
        SingleInstance s2 = SingleInstance.s;
        System.out.println(s1==s2);
    }
}
