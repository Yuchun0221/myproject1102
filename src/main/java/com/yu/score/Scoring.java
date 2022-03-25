package com.yu.score;

public class Scoring {
    public static void main(String[] args) {
        Student jack=new Student("Jack",70,88);
        /*jack.name="Jack";
        jack.english=70;
        jack.math=88;*/
        Student hank=new Student("Hank",60,80);
        GraduateStudent jane=new GraduateStudent("Jane",80,70,90);
        jane.name="Jane";
        jack.print();
        hank.print();
        jane.print();

    }
}
