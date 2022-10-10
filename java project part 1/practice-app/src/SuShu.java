public class SuShu {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i=0,j=101;i<arr.length;i++,j++){
            arr[i]=j;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=2;j<arr[i]/2;j++){
                if(arr[i]%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println(count);
    }

}
