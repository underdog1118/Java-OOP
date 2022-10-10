import java.util.Scanner;

public class NumberJiaMi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password's number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the password" + (i + 1) + ": ");
            int number = sc.nextInt();
            arr[i] = number;
        }
        printf(arr);
        printf(encry(arr));

    }
    public static void printf(int[] a){
        System.out.print("{");
        for(int i=0;i<a.length;i++){
            System.out.print(i<a.length-1?a[i]+",":a[i]);
        }
        System.out.print("} ");
    }
    public static int[] encry(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] + 5) % 10;
        }
        int[] oppo = new int[array.length];
        for (int i = 0, j = array.length-1; i < array.length; i++, j--) {
            oppo[i] = array[j];
        }
        return oppo;
    }
}
