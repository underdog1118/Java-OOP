package encapsulation;

public class Student {
    private int age;

    public int getAge(){           //getAge 取值
        return this.age;
    }
    public void setAge(int age){   //setAge 赋值
        if(age>=0&&age<=200){
            this.age =age;
        }
        else
            System.out.println("Wrong age");

    }
}
