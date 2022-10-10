package d7_abstract_template;

public abstract class Student {
    /*正式声明模板方法*/
    public final void write(){
        System.out.println("\t《我的爸爸》");
        System.out.println("你的爸爸是啥样");
        //正文部分每个子类都有，但是都不一样
        //模板方法把正文定义为抽象方法
        System.out.println(writeMain());

        System.out.println("香香的，小小的");

    }
    public abstract String writeMain();
}
