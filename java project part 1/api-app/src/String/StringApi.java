package String;

public class StringApi {
    public static void main(String[] args) {
        //1.public int length():  获取字符串的长度
        String name = "wrnm";
        System.out.println(name.length());

        //2. public char charAt(int index)： 获取某个索引位置处的字符
        char c = name.charAt(1);
        System.out.println(c);
        System.out.println("-------------遍历字符串中的每个字符------------");
        for(int i=0; i<name.length();i++){
            char ch = name.charAt(i);
            System.out.println(ch);
        }

        //3. public char[] toCharArray(): 把字符转换成字符数组
        char[] chc = name.toCharArray();
        for (int i = 0; i < chc.length; i++) {
            char ch = chc[i];
            System.out.println(ch);
        }

        //4.public String substring(int beginIndex. int endIndex) 截取内容，包前不包后
        String c1 = name.substring(0,2);
        System.out.println(c1);

        //5.public String substring(int beginIndex)
        String c2 = name.substring(1);
        System.out.println(c2);

        //6.public String replace(charSequence target, charSequence replacement)
        String c3 = name.replace("r","s");
        System.out.println(c3);

        //7.public boolean contains(CharSequence s)
        System.out.println(name.contains("r"));
        System.out.println(name.contains("a"));

        //8.public boolean startsWiths(String prefix)
        System.out.println(name.startsWith("w"));
        System.out.println(name.startsWith("s"));

        //9.public String[] split(String s): 按照某个内容把按字符串分割成字符串数组返回
        String s = "w,r,n,m";
        String[] s2 = s.split(",");
        for (int i = 0; i < s2.length; i++) {
            System.out.println(i+"是： "+s2[i]);
        }
    }

}
