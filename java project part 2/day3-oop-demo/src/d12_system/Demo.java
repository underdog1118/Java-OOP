package d12_system;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        System.out.println("开始");

//      System.exit(0);  //终止JVM

        long time = System.currentTimeMillis();   //返回当前系统的时间毫秒值形式化
        System.out.println(time);
        //性能分析
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("输出："+ i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000.0 +"s");

        //数组拷贝
        int[] arr1 = {10,20,30,40,50,60,70};
        int[] arr2 = new int[6];  //[0,0,0,0,0,0] -> [0,0,40,50,60,0]
        System.arraycopy(arr1,3,arr2,2,3);
        System.out.println(Arrays.toString(arr2));




        System.out.println("结束");
    }
}
