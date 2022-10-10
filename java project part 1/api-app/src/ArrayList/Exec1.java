package ArrayList;

import java.util.ArrayList;

public class Exec1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(98);
        list.add(77);
        list.add(66);
        list.add(89);
        list.add(79);
        list.add(50);
        list.add(100);
        for (int i = 0,j=0; i < list.size(); i++) {
            int t = list.get(i);
            if(t<80){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

    }
}
