package d1_polymorphic;
/*多态*/
public class Test {
    public static void main(String[] args) {
        //形式: 父类类型 对象名称 = new 子类构造器
        Animal a = new Dog();
        a.run();                   //方法调用： 编译看左边，运行看右边
        System.out.println(a.name);// 变量调用： 编译和运行都看左边

        Animal t = new Tortoise();
        t.run();
        System.out.println(t.name);

    }
}
