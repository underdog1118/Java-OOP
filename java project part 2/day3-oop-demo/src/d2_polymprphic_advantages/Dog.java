package d2_polymprphic_advantages;

public class Dog extends Animal {
    public String name = "子类狗";
    @Override
    public void run() {
        System.out.println("狗跑的快");

    }
    /*子类独有功能*/
    public void lookDoor(){
        System.out.println("看门中");
    }
}
