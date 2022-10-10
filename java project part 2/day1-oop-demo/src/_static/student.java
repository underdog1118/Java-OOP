package _static;

public class student {
    private String name;

    public static int getMax(int age1,int age2){           //静态方法

        return age1>age2?age1:age2;
    }

    public void study(){                                   //实例方法
        System.out.println(name+" is studying");

    }

    public static void main(String[] args) {
        System.out.println(getMax(5,3));
        System.out.println(student.getMax(5,3));

        student xm = new student();
        xm.name = "sss";
        xm.study();

        System.out.println(xm.getMax(5,3));   //不推荐 , 直接在类中使用


    }
}
