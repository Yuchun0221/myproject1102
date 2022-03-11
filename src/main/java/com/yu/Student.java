package com.yu;

public class Student {
    String name;
    int english;
    int math;
    public Student(String name){
        this.name=name;
    }
    public Student(String name, int english, int math){
        this(name);
        //this.name=name;
        this.english=english;
        this.math=math;  //Hank part
    }
    public Student(){
        this("John Doe",-1,-1);
        /*name="JohnDoe";
        english=-1;
        math=-1;*/
    }
    public void print(){
        System.out.println(name+"\t"+english+"\t"+math);
    }

}
