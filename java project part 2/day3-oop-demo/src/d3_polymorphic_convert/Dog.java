package d3_polymorphic_convert;

public class Dog extends Animal {
    public String name = "子类狗";
    @Override
    public void run() {
        System.out.println("狗跑的快");

    }
    /*子类独有功能*/
    public void lookDoor(){
        System.out.println("狗在看门中");
    }
}
