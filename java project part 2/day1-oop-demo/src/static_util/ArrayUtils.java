package static_util;

public class ArrayUtils {

    private ArrayUtils(){}; //工具类直接私有，不用构造对象，专业优雅

    public static String toString(int[] arr){
        String s = "[";
        if(arr == null || arr.length==0){
            return null;
        }else{
            for (int i = 0; i < arr.length; i++) {
                s += (i<arr.length-1?arr[i]+",":arr[i]);
            }
            s += "]";

        }return s;
    }

    public static double getAverage(double[] arr){
        double sum = 0.0;
        double max = arr[0];
        double min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum-max-min/(arr.length-2);
    }
}
