package extends_extra;

public class Test_extra {
    public static void main(String[] args) {
        System.out.println("======subclass1类继承=======");
        SubClass1 s1 = new SubClass1();
        SubClass1 s2 = new SubClass1(100);


        System.out.println("======subclass2类继承=======");
        Subclass2 s3 = new Subclass2();
        Subclass2 s4 = new Subclass2(200);

    }
}
