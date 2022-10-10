package extends_constru2;

public class People {
    private String name;
    private int age;

    public People(){
        System.out.println("父类无参");
    }
    public People(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("父类有参");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
