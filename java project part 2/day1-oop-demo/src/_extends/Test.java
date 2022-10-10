package _extends;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");//父
        s.setAge(12);   //父
        s.queryCourse();//父
        s.writeInfo();  //  子
        s.test();

    }
}
