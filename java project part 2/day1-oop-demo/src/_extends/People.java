package _extends;
//父类
public class People {
    private String name;
    private int age;

    public void eat(){
        System.out.println("Dad");
    }
    public void queryCourse(){
        System.out.println(name+"正在查看课表");
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
