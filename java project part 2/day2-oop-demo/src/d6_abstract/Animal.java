package d6_abstract;

public abstract class Animal {    //抽象类
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void run();   //抽象方法，不能写{}方法体代码


}
