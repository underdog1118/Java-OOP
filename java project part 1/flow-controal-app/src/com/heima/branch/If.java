package com.heima.branch;

public class If {
    public static void main(String[] args) {
        int score =99;
        if(score>=0 && score<60){
            System.out.println("C");
        }
        else if(score>=60 && score<80){
            System.out.println("B");
        }
        else
            System.out.println("A");
    }
}
