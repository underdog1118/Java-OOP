package extends_constructor;

public class Test {
    public static void main(String[] args) {
        //继承后子类构造器特点：子类构造器默认先访问父类无参构造器，再执行自己
        Dog d = new Dog();
        System.out.println("=====================");
        Dog d2 = new Dog("傻逼");

    }
}
