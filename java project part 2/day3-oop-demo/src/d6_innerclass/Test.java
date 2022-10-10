package d6_innerclass;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.setAge(12);
        in.setName("sn");
        in.show();
        Outer.Inner.test();

    }
}
