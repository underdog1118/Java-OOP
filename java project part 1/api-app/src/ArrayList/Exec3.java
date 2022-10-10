package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exec3 {
    public static void main(String[] args) {
        ArrayList<E3Student> info = new ArrayList();
        E3Student s1 = new E3Student(20180302,"叶孤城",23,"护理一班");
        E3Student s2 = new E3Student(20180303,"东方不败",23,"推拿二班");
        E3Student s3 = new E3Student(20180304,"西门吹雪",26,"中医学四班");
        E3Student s4 = new E3Student(20180305,"梅超风",26,"神经科2班");
        info.add(s1);
        info.add(s2);
        info.add(s3);
        info.add(s4);
        System.out.println("学号\t\t\t姓名\t\t年龄\t班级");
        for (int i = 0; i < info.size(); i++) {
            E3Student e = info.get(i);
            System.out.println(e.getNumber()+"\t"+e.getName()+"\t"+e.getAge()+"\t"+e.getClas());
        }

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入学号： ");
            int num = sc.nextInt();
            Search(info, num);
        }

    }
    public static void Search(ArrayList<E3Student> students,int number){
        for (int i = 0; i < students.size(); i++) {
            E3Student e = students.get(i);
            if(e.getNumber()==number){
                System.out.println("学号\t\t\t姓名\t\t年龄\t班级");
                System.out.println(e.getNumber()+"\t"+e.getName()+"\t"+e.getAge()+"\t"+e.getClas());
            }
            else{
                System.out.println("查无此人");
                break;}
        }
    }
}
