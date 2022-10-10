package d6_abstract_attention.d6_abstract_test;

public class Gold extends Card {

    @Override
    public void pay(double money){
        System.out.println("您的余额为"+getMoney());
        System.out.println("您当前消费"+money);
        System.out.println("您打折后消费为"+money*0.8);
        setMoney(getMoney()-money*0.8);
        System.out.println("您消费后余额为"+getMoney());

    }
}
