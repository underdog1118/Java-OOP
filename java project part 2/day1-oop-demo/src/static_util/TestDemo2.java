package static_util;

public class TestDemo2 {
    public static void main(String[] args) {

    int[] arr = {1,3,5,46,4};
    double[] arr2 = {1.0,10.0,5.0};
        System.out.println(arr);
        System.out.println(ArrayUtils.toString(arr));
        System.out.println(ArrayUtils.getAverage(arr2));
    }
}
