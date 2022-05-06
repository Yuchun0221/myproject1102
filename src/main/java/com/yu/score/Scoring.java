package com.yu.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();
        students.add(new Student("Jack",70,88));
        /*jack.name="Jack";
        jack.english=70;
        jack.math=88;*/
        students.add(new Student("Hank",60,59));
        students.add(new GraduateStudent("Jane",80,70,90));
        for(Student s:students){
            s.print();
        }

    }
}
