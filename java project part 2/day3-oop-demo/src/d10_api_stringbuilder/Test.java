package d10_api_stringbuilder;

public class Test {
    public static void main(String[] args) {
        int[] ass = new int[]{11,22,33,44,55};
        System.out.println(arr(ass));
    }

    public static String arr(int[] a){
        if(a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("该数组内容为：[");
            for (int i = 0; i < a.length; i++) {
                sb.append(i != a.length - 1 ? a[i] + "," : a[i]);
            }
            sb.append("]");
            String s = sb.toString();
            return s;

        }else{
            return null;
        }
    }
}

