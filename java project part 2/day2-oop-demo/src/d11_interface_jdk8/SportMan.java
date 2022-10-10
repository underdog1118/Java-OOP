package d11_interface_jdk8;

public interface SportMan {
    /*  1.JDK 8 之后，默认方法(实例方法)
       --必须default修饰，默认用public修饰
       默认方法，接口不能创建对象，只能让类实现后由类的对象调用
    */
    public default void run(){
        go();  //调3的私有方法
        System.out.println("跑");

    }
    /*  2.静态方法
    *   必须使用static修饰，默认Public
    *   必须用接口名调用
    * */
    public static void study(){
        System.out.println("学习中");
    }

    /*  3.私有方法
    *   JDK1.9后有
    *   必须在接口内部才能被访问
    * */
    private void go(){
        System.out.println("准备");
    }
}

class PingPongMan implements SportMan{

}

class Test{
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();
        SportMan.study();
    }
}
