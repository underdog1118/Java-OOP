public class PrintIntArray {
    public static void main(String[] args) {
        int[] ages ={};
        printf(ages);

    }
    public static void printf(int[] array){
        System.out.print("[");
        if(array.length>0) {
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ",");
            }
            System.out.print(array[array.length - 1]);
        }


            System.out.print("]");



    }
}
