import java.util.Scanner;

public class SearchIndex {
    public static void main(String[] args) {
       int[] ages={22,24,53,25,21};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int a = sc.nextInt();
        System.out.println(search(ages,a));

    }
    public static int search(int[] arr,int number){
        int m=-1;
        for(int i=0;i<arr.length;i++){
            if(number==arr[i]) {
                m=i;
                break;
            }
        }
        return m;
    }
}
