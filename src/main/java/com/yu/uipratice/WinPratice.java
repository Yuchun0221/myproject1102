package com.yu.uipratice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinPratice {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setLocation(800,300);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button=new JButton("button");
//        PraticeActionListener listener=new PraticeActionListener();
//        button.addActionListener(listener);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("taped");
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hi");
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setVisible(true);
    }
}
