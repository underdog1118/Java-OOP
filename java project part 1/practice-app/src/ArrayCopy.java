public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33};
        int[] arr2 = new int[arr1.length];
        copy(arr1, arr2);
        printf(arr2);
        }

    public static void printf(int[] a) {
        System.out.print("{");
        for(int i=0;i<a.length;i++) {
            System.out.print(i<a.length-1?a[i]+",":a[i]);
        }
        System.out.println("}");
    }
    public static void copy(int[] a1,int[] a2){
        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }
    }

}
