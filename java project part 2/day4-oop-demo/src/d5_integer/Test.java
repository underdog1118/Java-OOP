package d5_integer;

public class Test {
    public static void main(String[] args) {

        int a = 10;
        Integer a1 = 11;
        Integer a2 = a;  //自动装箱 int->Integer

        Integer it = 100;
        int it1 = it ;  //自动拆箱 Integer -> int

        double db = 100.5;
        Double db2 = db;   //装箱
        double db3 = db2;   //拆箱

        //int age = null; //报错
        Integer age = null;
        Integer age2 = 0;

        System.out.println("----");
        //1.包装类可以把基本类型的数据转换成字符串形式
        Integer  i3 = 23;
        String rs = i3.toString();
        System.out.println((rs+1));

        String rs2 = Integer.toString(i3);
        System.out.println(rs2+1);

        String rs3 = i3 + "";    //最方便，直接数字+字符串-》字符串
        System.out.println(rs3+1);

        //2.把字符串类型的数值转换成真实的数据类型（有用）
        //转换成整数
        int num = Integer.parseInt(rs);
        System.out.println(num);
        //转换成小数
        String rs4 = "";
        double num2 = Double.parseDouble(rs);
        System.out.println(num2);

        int num3 = Integer.valueOf(rs);
        double num4 = Double.valueOf(rs);   //valueof更好用
        System.out.println(num3);
        System.out.println(num4);






    }
}
