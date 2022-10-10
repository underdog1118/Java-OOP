package d6_innerclass;

public class Outer {
    public static int num =111;
    public String hobby = "FLY";

   public class Inner{    //成员内部类
       private String name;
       private int age;
       public static int a=100;

       public static void test(){
           System.out.println(a);
       }

       public void show(){
           System.out.println("showing");
           System.out.println(num);
           System.out.println(hobby);
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
}
