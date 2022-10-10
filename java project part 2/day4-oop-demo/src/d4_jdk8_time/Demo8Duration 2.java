package d4_jdk8_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo8Duration {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime birth = LocalDateTime.of(1998,11,18,12,12,12);

        System.out.println(birth);

        Duration duration = Duration.between(birth, today);

        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toSeconds());


    }
}
