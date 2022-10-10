package d5_innerclass_static;

public class Outer {

    public static int a = 199;
    private String hobby;

    public static class Inner{  //静态成员内部类
        private String name;
        private int age;
        public static String schoolName;

        public Inner(){}        //无参构造器

        public Inner(String name, int age) {  //有参构造器
            this.name = name;
            this.age = age;
        }

        public void show(){
            System.out.println("内部类方法执行");
            System.out.println(a);   // 内部类可以直接访问外部类静态成员
       //   System.out.println(hobby);  内部类不能访问外部类实例成员
            Outer o = new Outer();
            o.hobby = "FLY";
            System.out.println(o.hobby); //创立对象后可访问
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
