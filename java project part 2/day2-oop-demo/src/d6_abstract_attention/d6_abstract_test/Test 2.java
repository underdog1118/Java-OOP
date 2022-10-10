package d6_abstract_attention.d6_abstract_test;

public class Test {
    public static void main(String[] args) {
        Gold g1 = new Gold();
        g1.setName("老王");
        g1.setMoney(10000);
        System.out.println("尊敬的用户："+g1.getName()+"您好");
        g1.pay(1000);

        Silver s = new Silver();
        s.setName("sb");
        s.setMoney(5000);
        System.out.println("尊敬的用户："+s.getName()+"您好");
        s.pay(1000);

    }
}
