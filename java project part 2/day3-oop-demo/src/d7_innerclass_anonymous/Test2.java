package d7_innerclass_anonymous;

public class Test2 {
    public static void main(String[] args) {
        Swimming s = () -> System.out.println("学生快乐地自由泳");
        go(s);
    }

    public static void go(Swimming s){
        System.out.println("开始....");
        s.swim();
        System.out.println("结束....");
    }
}

/*被匿名内部类取代*/
//class Student implements Swimming{
//    @Override
//    public void swim() {
//        System.out.println("学生快乐地自由泳");
//    }
//}

interface Swimming{
    void swim();
}