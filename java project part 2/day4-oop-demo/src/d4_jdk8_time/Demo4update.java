package d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

public class Demo4update {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        System.out.println(lt.minusHours(1));
        System.out.println(lt.minusMinutes(1));
        System.out.println(lt.plusSeconds(1));
        System.out.println(lt.plusNanos(1));

        System.out.println("---------------");
        System.out.println(lt); //nowtime不会改变，每次修改生成一个新时间

        System.out.println("-----------------");
        LocalDate ld = LocalDate.of(2022,7,3);
        LocalDate nowdate = LocalDate.now();

        MonthDay birMd = MonthDay.of(ld.getMonthValue(),ld.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowdate);

        System.out.println(birMd.equals(nowMd));

    }
}
