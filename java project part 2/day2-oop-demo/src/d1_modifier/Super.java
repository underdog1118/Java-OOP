package d1_modifier;

public class Super {
    private void privateMethod(){
        System.out.println("====private====");//只能在本类中访问
    }

    void method(){
        System.out.println("====null===="); //缺省：只能本类中、同包下其他类访问（包访问权限）
    }

    protected void protectedMethod(){
        System.out.println("====protected===="); //本类、同包其他类， 其他包的子类中
    }

    public void publicMethod(){
        System.out.println("====public====");   //本类、同包其他类， 其他包的子类中, 其他包的无关类中
    }

    public static void main(String[] args) {
        Super s = new Super();
        s.privateMethod();
        s.method();
        s.protectedMethod();
        s.publicMethod();
    }
}
