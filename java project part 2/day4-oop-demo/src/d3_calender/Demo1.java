package d3_calender;

import java.util.Calendar;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        //1.拿到系统此刻日历对象
        Calendar ca = Calendar.getInstance();
        System.out.println(ca);

        //2.获取日历信息
        int year = ca.get(Calendar.YEAR);
        System.out.println(year);
        int month = ca.get(Calendar.MONTH)+1;
        System.out.println(month);
        int day = ca.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);

        //3.修改日历
        ca.set(Calendar.HOUR,12);
        System.out.println(ca);

        //4.为某字段增加/减少指定值
        ca.add(Calendar.DAY_OF_YEAR,64);
        ca.add(Calendar.DAY_OF_YEAR,-64);

        //5.拿到此刻日期对象
        Date d = ca.getTime();
        System.out.println(d);
        //6.拿到此刻时间毫秒值
        long time = ca.getTimeInMillis();
        System.out.println(time);



    }
    }

