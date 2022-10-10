package d3_final;

public class Test2 {
    public static final String SCHOOL_NAME = "黑马"; //final-常量, 英文单词全大写，多个单词下划线连接

    private final String name = "大老师";

    public static void main(String[] args) {
        // 3.final修饰变量，变量只能赋值一次
        //  变量：
        //     1、局部变量
        //     2、成员变量
        //        1）静态成员变量
        //        2）实例成员变量
        //
        // 一.修饰局部变量
        final double rate = 3.14;
    //  rate = 1231;  无法改变
        buy(0.8);

        //二.修饰静态成员变量(public static final)
    //  SCHOOL_NAME = "傻逼";  第二次赋值

        //三.修饰实例成员变量
        Test2 t =new Test2();
    //  t.name = "ada";  无法二次赋值，并且所有对象的name相同且不能变，用不到
        Test2 t2 =new Test2();
        System.out.println(t.name);
        System.out.println(t2.name);


//=================================================================

       //final修饰引用类型的变量，地址值不能变，指向对象内容可以变
        final Teacher t3 = new Teacher("上课，打球");
      //t3 = null;  //地址不能赋值二次
        System.out.println(t3);
        System.out.println(t3.getHobby());
        t3.setHobby("睡觉");
        System.out.println(t3);
        System.out.println(t3.getHobby());

    }

    public static void buy(final double z){
    //    z = 0.1;  不能赋值，已经接了一次final z值
    }
}
//=========================================================

class Teacher{
    private String hobby;

    public Teacher(String hobby){
        this.hobby = hobby;
    }
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}