package d3_polymorphic_convert;

public class Tortoise extends Animal {
    public String name = "子类乌龟";
    @Override
    public void run() {
        System.out.println("乌龟跑得慢");
    }
    /*独有*/
    public void layEggs(){
        System.out.println("乌龟在下蛋");
    }
}
