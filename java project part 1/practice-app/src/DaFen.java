import java.util.Scanner;

public class DaFen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the people's number: ");
        int p = sc.nextInt();
        int[] score = new int[p];
        System.out.println(calc(score));

    }
    public static double calc(int[] s){
        int sum=0,max=s[0],min=s[0];
        for(int i=0;i<s.length;i++){
            System.out.println("enter the score "+i+": ");
            Scanner sc = new Scanner(System.in);
            s[i]= sc.nextInt();
            sum+=s[i];
        }
        for(int i=1;i<s.length;i++){
            if(s[i]>max)
                max=s[i];
            else if(s[i]<min)
                min=s[i];
        }
        return (double)((sum-max-min)*1.0/(s.length-2)); // *1.0用来返回小数
    }
}
