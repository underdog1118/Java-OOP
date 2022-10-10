package d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Demo7Peiod {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate Birth = LocalDate.of(1998,11,18);
        System.out.println(Birth);

        Period period = Period.between(Birth,today);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());






    }
}
