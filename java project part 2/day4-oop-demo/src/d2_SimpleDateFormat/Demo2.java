package d2_SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) throws ParseException {
        //解析字符串时间为日期对象
        //2021.8.6 11:11:11  往后走 2天14小时49分6秒后的时间

        String dateStr = "2021-08-06 11:11:11";

        //1.解析成日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse(dateStr);
        System.out.println(sdf.format(d1));

        long time1 = d1.getTime();  //解析得到时间毫秒值

        //2.往后走
        time1 += (6+49*60+14*60*60+2L*24*60*60)*1000;

        //3.格式化时间毫秒值即为结果
        String st2 = sdf.format(time1);
        System.out.println(st2);

    }
}
