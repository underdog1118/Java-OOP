package d2_SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        //格式化日期对象(指定格式)
        SimpleDateFormat d2 = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        System.out.println(d2);
        //开始格式化日期对象为字符串形式
        String st = d2.format(d1);
        System.out.println(st);

        //格式化时间毫秒值
        long time1 = System.currentTimeMillis();
        String st2 = d2.format(time1);
        System.out.println(st2);

    }
}
