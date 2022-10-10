import java.util.Scanner;

public class BuyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter money: ");
        double price = sc.nextDouble();
        System.out.println("enter month: ");
        int month = sc.nextInt();
        System.out.println("enter type: ");
        String type = sc.next();

        double answer = (calc(price,month,type));
        System.out.println(answer);

    }
    public static double calc(double money,int month,String type){
        if(month>=5 && month<=10){
            switch(type){
                case "Normal":
                    money*=0.85;
                    break;
                case "Great":
                    money*=0.9;
                    break;
                default:
                    System.out.println("Wrong");
                    money=-1;
            }
        }
        else if(month>=1 && month<=4 || month==11 || month==12) {
            switch (type) {
                case "Normal":
                    money *= 0.65;
                    break;
                case "Great":
                    money *= 0.7;
                    break;
                default:
                    System.out.println("Wrong");
                    money = -1;
            }
        }else
            System.out.println("wrong month");
            money=-1;

        return money;
    }
}
