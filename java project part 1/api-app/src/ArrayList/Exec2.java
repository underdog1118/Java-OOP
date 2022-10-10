package ArrayList;

import java.util.ArrayList;

public class Exec2 {
    public static void main(String[] args) {
        E2movie m1 = new E2movie("《肖申克的救赎》",9.7,"罗宾斯");
        E2movie m2 = new E2movie("《霸王别姬》",9.6,"张国荣");
        E2movie m3 = new E2movie("《阿甘正传》",9.5,"阿甘");
        ArrayList<E2movie> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        for (int i = 0; i < list.size(); i++) {
            E2movie m = list.get(i);
            System.out.println("电影名： "+m.getName());
            System.out.println("评分： "+m.getScore());
            System.out.println("演员： "+m.getActor());
            System.out.println("------------------");
        }

    }
}
