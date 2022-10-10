package extends_feature;

public class extends_feature {
    public static void main(String[] args) {
        //1.子类不能继承父类的构造器
        //2.子类是否可以继承父类的私有成员? 不能访问，但是已经继承
        Tiger t = new Tiger();
        t.eat(); //public共有成员，可访问
        //3.子类是否可以继承父类静态成员? 不算继承，只是共享
        System.out.println(t.location);
        System.out.println(Tiger.location);

        //4.子类不能多继承

    }

}
class Animal {
    public void eat() {  // private 不能访问，可继承
        System.out.println("eatingggggggg");
    }

    public static String location = "长隆动物园";
}
class Tiger extends Animal{

}
