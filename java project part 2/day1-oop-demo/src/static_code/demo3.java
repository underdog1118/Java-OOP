package static_code;

import java.util.ArrayList;

public class demo3 {

    public static ArrayList<String> cards = new ArrayList<>();
    static{
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♥","♠","♦","♣"};
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                String card = sizes[i]+colors[j];
                cards.add(card);
            }
        }
        cards.add("小王");
        cards.add("大王");
    }

    public static void main(String[] args) {
        //模拟斗地主游戏启动时初始化54张牌
        System.out.println(cards);

    }
}
