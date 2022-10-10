package d6_abstract_attention;

public class Test {
    public static void main(String[] args) {
        //abstract class特征
        //1.类有的东西，抽象类都有
        //2、抽象类中可以没有抽象方法。但是有抽象方法的必须是抽象类
        //3.一个类继承了抽象类，必须冲写完抽象类的全部抽象方法，否则该类也必须是抽象类
        //4.抽象类不能创建对象
        //final和abstract是互斥关系

        //Animal a = new Animal();   无法创立



    }
}
abstract class Animal{
   public abstract void run();
   public abstract void eat();
}

abstract class Dog extends Animal{
    @Override
    public void run() {

    }

}

class Huskies extends Dog{
    @Override
    public void eat() {

    }
}

