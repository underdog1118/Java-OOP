package thisDemo;

public class Test2 {
    public static void main(String[] args) {
        Car c = new Car("benz",40000.0);
        System.out.println(c.name);
        System.out.println(c.price);

        System.out.println("----------------");
        c.go("bmw");

        Car c2 = new Car();
    }
}
