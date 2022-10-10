public class ParaChuanDi2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        change(arr);  //与1不同，此处将arr数组的地址传递给方法
        System.out.println(arr[1]);
    }
    public static void change(int[] arr){
        System.out.println(arr[1]);
        arr[1]=222; //地址中的值已经被改变
        System.out.println(arr[1]);
    }
}
