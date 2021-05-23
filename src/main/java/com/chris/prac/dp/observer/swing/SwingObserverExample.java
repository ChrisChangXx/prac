package com.chris.prac.dp.observer.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * swing观察者的例子
 *
 * @author zhx
 * @创建人 zhanghui
 * @创建时间 2021/5/19
 * @描述
 * @date 2021/05/19
 */
public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go() {
        jFrame = new JFrame();

        JButton jButton = new JButton("我要放弃吗？");
        jButton.addActionListener(new AngleListener());
        jButton.addActionListener(new DevilListener());
        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);
        jFrame.setVisible(true);
        jFrame.setBounds(100,100,100,100);
    }

    class AngleListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("天使说：不要放弃，加油！");
        }
    }

    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("恶魔说：你不行的，放弃吧！");
        }
    }


}
