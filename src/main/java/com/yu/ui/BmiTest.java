package com.yu.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BmiTest extends JFrame {
    JButton button = new JButton("start");
    JLabel label = new JLabel("please enter your weight(kg)");
    JTextField number = new JTextField(5);
    JTextField number1 = new JTextField(5);
    JLabel label1 = new JLabel("please enter your height(m)");
    public BmiTest(){
        super();
        setSize(600,400);
        setLocation(700,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int w = Integer.parseInt(number.getText());
                int h = Integer.parseInt(number1.getText());
                System.out.println("your bmi is"+w/(h*h));
                }
        });
        setLayout(new FlowLayout());
        add(label);
        add(number);
        add(label1);
        add(number1);
        add(button);
        setVisible(true);
    }



    public static void main(String[] args) {BmiTest bmiTest = new BmiTest();

    }
}
