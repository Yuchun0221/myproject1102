package com.yu.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame1To100 extends JFrame {
    JButton button = new JButton("start");
    JLabel label = new JLabel("please enter your number");
    JLabel label1 = new JLabel("try it");
    JTextField number = new JTextField(5);
    int secert = new Random().nextInt(100)+1;
    public GuessFrame1To100(){
        super();
        setSize(600,400);
        setLocation(700,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(number.getText());
                if(num>secert){
                    label1.setText("smaller");
                }if(num<secert){
                    label1.setText("bigger");
                }if(num==secert){
                    label1.setText("Bingo, secert number is"+secert);
                }
            }
        });
        setLayout(new FlowLayout());
        add(label);
        add(number);
        add(button);
        add(label1);
        setVisible(true);
        System.out.println(secert);
    }

    public static void main(String[] args) {
        GuessFrame1To100 guessFrame1To100 = new GuessFrame1To100();
    }
}
