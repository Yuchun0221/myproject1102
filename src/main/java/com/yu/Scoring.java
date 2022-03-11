package com.yu;

public class Scoring {
    public static void main(String[] args) {
        Student jack=new Student("Jack",70,88);
        /*jack.name="Jack";
        jack.english=70;
        jack.math=88;*/
        Student hank=new Student("Hank",60,80);
        Student s=new Student();
        jack.print();
        hank.print();
        s.print();
    }
}
