package d4_jdk8_time;

import java.time.LocalDate;

public class Demo1LocalDate {
    public static void main(String[] args) {
        //1.获取本地日期对象
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

        //当年的第几天
        System.out.println(ld.getDayOfYear());
        //星期
        System.out.println(ld.getDayOfWeek());
        
        //月份
        System.out.println(ld.getMonth());

        System.out.println("------------------------");

        LocalDate ld2 = LocalDate.of(1998,11,18);
        System.out.println(ld2);



    }
}
