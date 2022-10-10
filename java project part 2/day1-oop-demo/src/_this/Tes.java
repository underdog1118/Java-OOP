package _this;

public class Tes {
    public static void main(String[] args) {

    Student s1 = new Student("傻逼","傻逼学院");
    System.out.println(s1.getName());
    System.out.println(s1.getSchoolName());

    System.out.println("=====================");

    Student s2 = new Student("聪明逼");
    System.out.println(s2.getName());
    System.out.println(s2.getSchoolName());
    }
}
