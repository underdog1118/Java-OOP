package extends_extra;

public class SuperClass {
    private int n;
    
    public SuperClass(){
        System.out.println("父类无参");
    }
    public SuperClass(int n){
        System.out.println("父类有参");
        this.n = n;
    }
}
