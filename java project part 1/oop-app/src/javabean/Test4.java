package javabean;

public class Test4 {
    public static void main(String[] args) {
        User u = new User();
        u.setName("qzp");
        u.setHeight(190);
        u.setSalary(100000);
        System.out.println(u.getName());
        System.out.println(u.getHeight());
        System.out.println(u.getSalary());

        User u2 = new User("wzx",200,2000);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u.getSalary());

    }
}
