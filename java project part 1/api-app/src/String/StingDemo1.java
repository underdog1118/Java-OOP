package String;

public class StingDemo1 {
    public static void main(String[] args) {
        //1.
        String name = "I love you";
        System.out.println(name);

        //2.public String()  几乎不用
        String s1 = new String();
        System.out.println(s1);

        //3.pubic String(String) 几乎不用
        String s2 = new String("I am Chinese");
        System.out.println(s2);

        //4. public String(char[] c)
        char[] chars= {'a','b','c'};
        String s3 = new String(chars);
        System.out.println(s3);

        //5. public String(byte[] b)
        byte[] bytes = {55,66,77,127};
        String s4 = new String(bytes);   //转换成ASCII
        System.out.println(s4);
    }
}
