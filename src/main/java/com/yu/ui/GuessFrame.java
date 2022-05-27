package com.yu.ui;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    JButton  button=new JButton("guess");
    JLabel label1=new JLabel("please enter number");
    JLabel label=new JLabel("lets try");
    JTextField number=new JTextField(8);
    Random random = new Random();
    int secert = random.nextInt(10)+1;
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(700,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(number.getText());
                if(num>secert){
                    label.setText("Smaller");
                }if(num<secert){
                    label.setText("bigger");
                }if(num==secert){
                    label.setText("bingo");
                }

//                label.setText("Hello");
            }
        });

        setLayout(new FlowLayout());
        add(label1);
        add(number);
        add(button);
        add(label);
        setVisible(true);
        System.out.println(secert);
    }





    public static void main(String[] args) {
        GuessFrame guessFrame=new GuessFrame();
//      guessFrame.setSize(600,400);
//      guessFrame.setVisible(true);
    }
}

