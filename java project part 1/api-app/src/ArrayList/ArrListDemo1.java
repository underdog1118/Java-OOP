package ArrayList;

import java.util.ArrayList;

public class ArrListDemo1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("java");
        list.add(1);
        list.add('s');
        list.add(22.22);
        System.out.println(list);;

 /*       list.clear();
        System.out.println(list);*/

        list.add(1,3);
        System.out.println(list);
    }
}
