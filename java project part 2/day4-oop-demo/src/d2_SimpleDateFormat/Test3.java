package d2_SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        //秒杀活动判断
        //1.开始和结束
        String startTime = "2021-11-11 00:00:00";
        String endTime = "2021-11-11 00:10:00";
        //2.解析时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse(startTime);
        Date d2 = sdf.parse(endTime);
        //3.得到时间毫秒值
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        //4.输入购买时间并解析得到毫秒值
        String person1 = "2021-11-11 00:03:48";
        String person2 = "2021-11-11 00:10:48";
        Date d3 = sdf.parse(person1);
        Date d4 = sdf.parse(person2);
        long time3 = d3.getTime();
        long time4 = d4.getTime();
        //5.判断
        if(time3-time1<time2-time1){
            System.out.println("1成功");
        }else{
            System.out.println("1失败");
        }
        if(time4-time1<time2-time1){
            System.out.println("2成功");
        }else{
            System.out.println("2失败");
        }



    }
}
