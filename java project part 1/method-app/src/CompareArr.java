public class CompareArr {
    public static void main(String[] args) {
        int[] a={2,3,4};
        int[] b={2,3,5};
        System.out.println(compare(a,b));

    }

    public static boolean compare(int[] arr,int[] arr2){
        if(arr!=null && arr2!=null && arr.length==arr2.length){
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=arr2[i])
                    return false; //             return;  单独使用立即跳出并结束当前method
            }
            return true;
        }
        else
            return false;
    }
}