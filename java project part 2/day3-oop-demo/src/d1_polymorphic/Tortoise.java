package d1_polymorphic;

public class Tortoise extends Animal{
    public String name = "子类乌龟";
    @Override
    public void run() {
        System.out.println("乌龟跑得慢");
    }
}
