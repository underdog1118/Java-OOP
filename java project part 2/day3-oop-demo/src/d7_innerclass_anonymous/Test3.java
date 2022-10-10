package d7_innerclass_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    通过GUI变成理解匿名内部类的真实使用场景
* */
public class Test3 {
    public static void main(String[] args) {
        //1.创建窗口
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);

        //2.创建按钮对象
        JButton btn = new JButton("登录");

        //重点：匿名内部类
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"点我一下");
            }
        });

        //3.吧按钮对象添加到窗口上
        panel.add(btn);

        //4.展示窗口
        win.setSize(400,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
