package d10_api_stringbuilder;
/*
*   操作字符串， 知道性能好的原因
* */
public class Demo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("bc");
        sb.append(1);
        sb.append(true);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder();
        sb1.append('a').append('b').append('c'); //链式编程
        System.out.println(sb1);

        sb1.reverse().append("110");   //反转
        System.out.println(sb1);

        sb1.replace(0,3,"abc"); //取代
        System.out.println(sb1);

        //注意：StringBuilder只是拼接字符创手段，效率好。 最终结果要恢复成String类型
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ss").append(456);
        String sb3 = sb2.toString();
        check(sb3);
    }

    public static void check(String data){
        System.out.println(data);
    }
}
