package d12_interface_extra_unnecessary;

public interface A {
    static void test(){
        System.out.println("A");
    }
}

interface B {
    static void test(){
        System.out.println("B");
    }
}

class C implements A,B{
    public static void main(String[] args) {
    //      C.test();  无法使用
    A.test();
    B.test();
    //重名不冲突

        Cat c = new Cat();
        c.eat();

        CC cc = new CC();
        cc.go();
    }
}

/*一个类继承了父类又实现了接口，两者中有相同名方法，默认用父类的*/
interface Food{
    default void eat(){
        System.out.println("接口吃");
    }
}
class Animal{
    public void eat(){
        System.out.println("父类吃");
    }
}
class Cat extends Animal implements Food,A{   //先extends再implements

}

/*一个类实现多个接口，多个接口中存在同名的默认方法，重写即可*/
interface AA{
    default void go(){
        System.out.println("AA");
    }
}

interface BB{
    default void go(){
        System.out.println("BB");
    }
}

class CC implements AA,BB{
    @Override
    public void go() {
        AA.super.go();   
    }
}

