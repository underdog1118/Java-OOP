package d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo6DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //解析 格式化器
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a" );
        System.out.println(dtf.format(ldt));  //正格式化

        System.out.println(ldt.format(dtf)); //逆格式化


        //解析字符串时间
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateStr = "2019-11-11 11:11:11";
        //解析当前字符串时间成为本地日期时间对象
        LocalDateTime ldt1 = LocalDateTime.parse(dateStr , dtf1);
        System.out.println(ldt1);

        System.out.println(ldt1.getDayOfMonth());
    }
}
