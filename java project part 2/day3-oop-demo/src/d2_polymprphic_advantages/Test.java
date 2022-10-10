package d2_polymprphic_advantages;


public class Test {
    public static void main(String[] args) {
        Animal t =new Tortoise() ;
        go(t); //方法回调


        Animal d = new Dog();
        go(d);
//      t.lookDoor(); //多态下不能访问子类的独有功能


    }

    public static void go(Animal a){  //接多态
        System.out.println("开始");
        a.run();
        System.out.println("结束");
    }
}
