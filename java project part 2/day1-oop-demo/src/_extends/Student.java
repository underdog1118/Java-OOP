package _extends;

public class Student extends People{

    public void writeInfo(){
        System.out.println(getName()+"写下来：cnm");
    }
    public void eat(){
        System.out.println("Son");
    }
    public void test(){
       this.eat();
       super.eat();
    }
}
