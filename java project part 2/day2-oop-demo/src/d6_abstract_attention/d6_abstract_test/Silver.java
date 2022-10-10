package d6_abstract_attention.d6_abstract_test;

public class Silver extends Card{
    @Override
    public void pay(double money){
        System.out.println("您的余额为"+getMoney());
        System.out.println("您当前消费"+money);
        double r = money*0.85;
        System.out.println("打折后的是实际消费为"+r);
        setMoney(getMoney()-r);
        System.out.println("你的余额为"+getMoney());
    }

}
