package extends_method;

public class Test {
    public static void main(String[] args) {
        //继承后访问：就近原则
        Dog d = new Dog();
        d.run();      //子类
        d.lookDoor(); //子类
        d.showName();
    }
}

class Animal{
    public String name = "动物名";

    public void run(){
        System.out.println("动物可以跑");
    }
}

class Dog extends Animal{
    public String name = "狗名";

    public void lookDoor(){
        System.out.println("狗可以看门");
    }
    public void run(){
        System.out.println("狗跑得快");
    }
    public void showName(){
        String name = "局部名";   //若有，name输出子类局部名； 没有，输出子类成员范围中的名字
        System.out.println(name);           //子类局部名
    //    this.name = name;
        System.out.println(this.name);      //当前子类对象的name
    //    super.name =name;
        System.out.println(super.name);     //找父类的name

        this.run();            //子类的run 也可以直接 run();
        super.run();      //父类的run
    }
}
