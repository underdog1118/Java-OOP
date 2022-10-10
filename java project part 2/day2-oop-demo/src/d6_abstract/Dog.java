package d6_abstract;

public class Dog extends Animal{
    @Override  //重写抽象父类的方法
    public void run() {
        System.out.println("狗跑得快");

        setName("哈士奇");
        System.out.println(getName());
    }
}
