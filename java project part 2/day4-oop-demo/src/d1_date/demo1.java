package d1_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {
    public static void main(String[] args) {
        //系统时间
        Date d =new Date();
        System.out.println(d);

        //时间毫秒值
        long time = d.getTime();
        System.out.println(time);

        long time1 = System.currentTimeMillis();
        System.out.println(time1 );

        System.out.println("--------------------");
        //1.得到当前时间毫秒值
        Date d1 = new Date();
        System.out.println(d1);
        //2.当前时间往后走1H121S
        long time2 = System.currentTimeMillis();
        time2 += (60*60+121)*1000;
        //3.毫秒值转时间
        Date d2 = new Date(time2);
        System.out.println(d2);
        //3.1 方法2
        Date d3 = new Date();
        d3.setTime(time2);
        System.out.println(d3);




    }

}
