package d3_polymorphic_convert;


public class Test {
    public static void main(String[] args) {
    //1.自动类型转换
        Animal a = new Dog();
        a.run();
        System.out.println("=====================");
    //2.强制类型转换
        Animal a2 = new Tortoise();
        a2.run();

//      Dog d = (Dog) a2;//强转编译阶段不报错 （有继承或实现关系编译阶段可以强转，
//      不会出错）但运行会出错！！ClassCastException

        if(a2 instanceof Tortoise) {
            Tortoise t = (Tortoise) a2;  //从父类到子类，进行强制性转换
            t.layEggs();                 //强转后可以调用子类独有功能
        }else if(a2 instanceof Dog) {
            Dog d = (Dog) a2;
            d.lookDoor();
        }
        System.out.println("====================");

        Animal a3 = new Dog();
        go(a3);
        go(new Tortoise());
        go(new Animal() {
            @Override
            public void run() {
                System.out.println("父类run");
            }
        });

    }
    public static void go(Animal a){    //这种情况必须判断，因为不知道a的类型
        if(a instanceof Tortoise) {
            Tortoise t = (Tortoise) a;
            t.layEggs();
        }else if(a instanceof Dog) {
            Dog d = (Dog) a;
            d.lookDoor();
        }else {
            a.run();
        }

    }

}

