package d4_jdk8_time;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class Demo5Instant {
    public static void main(String[] args) {
        Instant ins = Instant.now();
        System.out.println(ins); //当前时间戳

        Instant ins1 = Instant.now();
        System.out.println(ins1.atZone(ZoneId.systemDefault())); //系统时间

        Date date = Date.from(ins);
        System.out.println(date);  //instant转date

        Instant ins2  = date.toInstant();
        System.out.println(ins2);  //date转instant






    }
}
