package extends_constru2;

public class Test {
    public static void main(String[] args) {
        //子类构造器如何访问父类有参构造器
        Teacher t = new Teacher("傻逼",12);

        System.out.println(t.getName());
        System.out.println(t.getAge());

        System.out.println("==========");

        Teacher t2 = new Teacher();
        System.out.println(t2.getName());
        System.out.println(t2.getAge());

        System.out.println("==========");

        Teacher t3 = new Teacher("大猪比");
        System.out.println(t3.getName());
        System.out.println(t3.getAge());

        System.out.println("==========");

        Teacher t4 = new Teacher(15);
        System.out.println(t4.getName());
        System.out.println(t4.getAge());

    }
}
