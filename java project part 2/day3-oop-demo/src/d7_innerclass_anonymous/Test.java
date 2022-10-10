package d7_innerclass_anonymous;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {    //匿名内部类，省去了下面的定义Tiger对象过程。 代码写出来就会创建一个子类对象
            @Override
            public void run() {
                System.out.println("老虎跑得快");
          }
        };
        a.run();
    }
}

//class Tiger extends Animal{
//    @Override
//    public void run() {
//        System.out.println("老虎跑得快");
//    }
//}

abstract class Animal{
    public abstract void run();
}
