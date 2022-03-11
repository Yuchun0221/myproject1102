package com.yu;
public class GraduateStudent extends Student{
    int thesis;
    public GraduateStudent(String name,int english,int math,int thesis){
        /*this.name=name;
        this.english=english;
        this.math=math;*/
        super(name, english, math);
        this.thesis=thesis;
    }
    public void print(){
        System.out.println(name+"\t"+english+"\t"+math+"\t"+getAverage()+"\t"+thesis);
    }
}
