package extends_extra;

public class Subclass2  extends SuperClass{
    private int n;

    public Subclass2(){
        super(300);
        System.out.println("子类2无参");
    }

    public Subclass2(int n){
        System.out.println("子类2有参"+n);
        this.n = n;
    }
}
