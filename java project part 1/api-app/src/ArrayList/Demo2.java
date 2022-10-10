package ArrayList;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList();  //只有string可录入
        list.add("java");
        list.add("java2");
        list.add("java3");
//        list.add(1);
//        list.add('s');
//        list.add(22.22);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);

        String e = list.get(2);
        System.out.println(e);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            String e2 = list.get(i);
            System.out.println(e2);
        }

        String e3 = list.remove(0);
        System.out.println(e3);
        System.out.println(list);

        list.remove("java");
        System.out.println(list);

        list.set(0,"java5");
        System.out.println(list);



    }
}
