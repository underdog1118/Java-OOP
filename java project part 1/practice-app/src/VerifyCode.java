import java.util.Random;
import java.util.Scanner;

public class VerifyCode{
    public static void main(String[] args) {
        System.out.println("enter the numbers: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(create(num));

    }
    public static String create(int number){
        Random r = new Random();
        String code = "";
        for(int i=0;i<number;i++){
            int type = r.nextInt(3);
            switch(type){
                case 0:
                    char ch1 = (char)(r.nextInt(65,91));             //大写 A 65 - Z 90  r.nextInt(65,91) == r.nextInt(26)+65
                    code += ch1;
                    break;
                case 1:
                    char ch2 = (char)(r.nextInt(97,123));
                    code += ch2;
                    break;
                case 2:
                    int n = r.nextInt(10);
                    code += n;
                    break;

            }

        }
        return code;

    }



    }