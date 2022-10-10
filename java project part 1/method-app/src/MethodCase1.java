public class MethodCase1 {
    public static void main(String[] args) {
        int[] ages = {2,325,33,43,35252};
        int c = ArrayMax(ages);
        System.out.println(c);

    }
    public static int ArrayMax(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
