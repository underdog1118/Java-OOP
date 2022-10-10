package extends_constru2;

public class Teacher extends People{

    public Teacher(String name,int age){
        super(name,age);//调用父类有参构造器，初始化继承自父类的数据
    }

    public Teacher(){
        this("大傻逼",13); //若没有，则调用父类无参
        System.out.println("子类无参");

    }

    public Teacher(String name){
        super(name,14);//部分调用父类有参
        System.out.println("子类有参1");
    }

    public Teacher(int age){
        this("大牛b",age); //this(..)用来调用子类兄弟构造器，此处等同super()调用父类
        System.out.println("子类有参2");
    }

}
