package d1_modifier;

public class Test {
    public static void main(String[] args) {
        //权限修饰符的修饰范围  private null protected public
        Super s = new Super();
 //     s.privateMethod();  //不行
        s.method();
        s.protectedMethod();
        s.publicMethod();

    }
}

