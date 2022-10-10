package d3_final;

public class Test {
    public static void main(String[] args) {

    }
    //1.final修饰类，类不能被继承
 /* class Wolf extends Animal{
       不能被继承
    }*/
    final class Animal{
    }

    //2.final修饰方法，方法不能被重写
    class Student extends People{
//        @Override
//        public void eat(){
//            System.out.println("呵呵呵呵");
//        }
    }

    class People{
        public final void eat(){
            System.out.println("吃吃吃吃");
        }
    }


}
