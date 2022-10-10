package d4_constant;

public class ConstantDemo1 {
    public static final String SCHOOL_NAME = "传智教育";
    public static final String USER_NAME = "admin";
    public static final String PASS_WORD = "123";

    public static void main(String[] args) {
        //常量
        System.out.println(SCHOOL_NAME);  //SCHOOL_NAME在.class文件中会被自动替换成真实字面量“传智教育”

        if (USER_NAME.equals("admin")){
            System.out.println("1");
        }
    }
}


