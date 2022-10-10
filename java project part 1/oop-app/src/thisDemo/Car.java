package thisDemo;

public class Car {
    String name;
    double price;

    public Car(){   //无参构造器本身定义类时自带
                    // 因为创建了有参构造器会消失，所以要自己写

    }
    //有参构造器
    public Car(String name,double price){
        this.name =name;
        this.price = price;
    }

    //方法
    public void go(String name){

        System.out.println(this.name+" is competing with "+name);
    }
}

//this用来指向当前对象的地址
