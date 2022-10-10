import java.util.Random;
import java.util.Scanner;

public class ShuangSeQiu {
    public static void main(String[] args) {
        int[] luckNumbers = createLuckNumbers();
        Random rm = new Random();
        int qi = rm.nextInt(1,100);
        System.out.println("欢迎购买第 "+qi+" 期双色球福利彩票~");
        int[] userNumbers = createUserNumbers();
        judge(luckNumbers,userNumbers);
        System.out.print("本期中奖号码为：");
        printf(luckNumbers);

    }
    public static void printf(int[] arr){
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(i<arr.length-1?arr[i]+",":arr[i]);
        }
        System.out.println("}");
    }
    public static int[] createLuckNumbers(){
        int[] num = new int[7];
        Random r = new Random();
        int[] check = new int[6];
        for(int i=0;i<num.length-1;i++){
            num[i]=r.nextInt(1,34);  // 1-34 no repeat
            check[i]=num[i];
            if(i>0) {                              //check repeat
                for (int j = 0; j < i; j++) {
                    if (num[i] == check[j]) {
                        i--;
                        break;
                    }
                }
            }
        }
        num[6]=r.nextInt(1,17);
        return num;
    }
    public static int[] createUserNumbers(){
        int num[] = new int[7];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<num.length-1;i++){
            System.out.println("请输入您的第 "+(i+1)+" 个红球号码（1~33不重复）: ");
            num[i]=sc.nextInt();
        }
        System.out.println("请输入您的蓝球号码（1~16）: ");
        num[6]=sc.nextInt();
        System.out.print("您选的双色球号码为：");
        printf(num);
        return num;
    }
    public static void judge(int[] luckNumbers,int[] userNumbers){
        int redHit= 0;
        int blueHit= 0;
        for(int i=0;i<userNumbers.length-1;i++){
            for(int j=0;j<luckNumbers.length-1;j++){
                if(userNumbers[i]==luckNumbers[j]){
                    redHit++;
                }
            }
        }
        if(userNumbers[userNumbers.length-1]==luckNumbers[luckNumbers.length-1]){
            blueHit++;
        }
        switch(redHit){
            case 6:
                    System.out.println(blueHit==1?"***恭喜您中6+1头等奖！！！奖金1000万元!***":"***恭喜您中6+0二等奖！！奖金500万元***");
                break;
            case 5:
                    System.out.println(blueHit==1?"***恭喜您中5+1三等奖！奖金3000元***":"***恭喜您中5+0四等奖！奖金200元!***");
                break;
            case 4:
                    System.out.println(blueHit==1?"***恭喜您中4+1四等奖！奖金200元！***":"***恭喜您中4+0五等奖！奖金10元！***");
                break;
            case 3:
                    System.out.println(blueHit == 1?"***恭喜您中3+1五等奖！奖金10元***":"***感谢您为福利事业作出的突出贡献!!!***");
                break;
            case 2:
                    System.out.println(blueHit == 1?"***恭喜您中2+1六等奖！奖金5元***":"***感谢您为福利事业作出的突出贡献!!!***");
                break;
            case 1:
                    System.out.println(blueHit == 1?"***恭喜您中1+1六等奖！奖金5元***":"***感谢您为福利事业作出的突出贡献!!!***");
                break;
            case 0:
                    System.out.println(blueHit == 1?"***恭喜您中0+1六等奖！奖金5元***":"***感谢您为福利事业作出的突出贡献!!!***");
                break;
//            default:
//                System.out.println("***感谢您为福利事业作出的突出贡献!!!***");
        }
        System.out.println("您中的红球个数为 "+redHit+" 个");
        System.out.println("您中的蓝球个数为 "+blueHit+" 个");

    }
}
