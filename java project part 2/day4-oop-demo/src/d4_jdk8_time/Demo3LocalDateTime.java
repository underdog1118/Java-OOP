package d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo3LocalDateTime {
    public static void main(String[] args) {

        //日期 时间
        LocalDateTime lc = LocalDateTime.now();
        System.out.println(lc);
        System.out.println(lc.getYear());
        System.out.println(lc.getMonthValue());
        System.out.println(lc.getMonth());

        LocalDate ld = lc.toLocalDate(); //转换
        LocalTime lt = lc.toLocalTime();
        System.out.println(ld);
        System.out.println(lt);


    }
}
