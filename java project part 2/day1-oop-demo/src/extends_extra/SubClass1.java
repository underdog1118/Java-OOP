package extends_extra;

public class SubClass1 extends SuperClass{
    private int n;
    public SubClass1(){
        //先自动调用父类无参
        System.out.println("子类1无参");
    }
    public SubClass1(int n){
        super(300);//调用父类有参
        System.out.println("子类1有参"+n);
        this.n = n;
    }
}
