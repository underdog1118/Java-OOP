package d8_api_object;
/*
    //掌握tostring
* */
public class Test1 {
    public static void main(String[] args) {
        Student s = new Student("JOJO",'男',18);
        String rs = s.toString();
        System.out.println(rs);  //tostring输出对象地址
        System.out.println(s);  //默认调用tostring
    }

}
