package d11_math;

public class Demo {
    public static void main(String[] args) {

        System.out.println(Math.abs(-1));         //1

        System.out.println(Math.ceil(10.999));    //11.0

        System.out.println(Math.floor(10.999));   //10.0

        System.out.println(Math.pow(2,3));       //8.0

        System.out.println(Math.round(5.5));     //6
        System.out.println(Math.round(5.4));     //5

        System.out.println(Math.random());   //0.0-1.0 包前不包后

        //math实现 3-9之间随机数  (0-6)+3
        System.out.println((6*Math.random())+3);






    }
}
