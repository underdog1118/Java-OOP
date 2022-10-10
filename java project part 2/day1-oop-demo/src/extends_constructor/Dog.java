package extends_constructor;

public class Dog extends Animal {
    public Dog(){
        //super();//写不写都有，子类全部构造器默认先找父类无参构造器执行
        System.out.println("子类无参构造器执行");
    }
    public Dog(String name){
        //super();
        System.out.println("子类有参构造器执行");
    }
}
