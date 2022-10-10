package d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Demo9ChronoUnit {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime birth = LocalDateTime.of(1998,11,18,0,0,0);
        System.out.println(birth);

        System.out.println("相差的年数："+ ChronoUnit.YEARS.between(birth,today));
        System.out.println("相差的月数："+ ChronoUnit.MONTHS.between(birth,today));
        System.out.println("相差的日数："+ ChronoUnit.DAYS.between(birth,today));
    }
}
