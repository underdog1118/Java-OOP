public class ParaChuanDi1 {
    public static void main(String[] args) {

        int a=10;
        change(a); //只是将实参a的值10赋予给方法中的形参a
        System.out.println(a); //10
    }
    public static void change(int a){
        System.out.println(a); //10
        a=20;
        System.out.println(a); //20
    }
}
