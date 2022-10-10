package d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo2LocalTime {
    public static void main(String[] args) {

        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        int hour = nowTime.getHour();
        int minute = nowTime.getMinute();
        int secoond = nowTime.getSecond();
        int nano = nowTime.getNano();

        System.out.println(hour);
        System.out.println(minute);
        System.out.println(secoond);
        System.out.println(nano);

        System.out.println("-------------------");

        System.out.println(LocalTime.of(8,27));

        System.out.println(LocalDateTime.of(1998,11,18,9,0));

    }
}
