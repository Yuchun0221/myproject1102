package com.yu.parking;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id="ABC-1234";
        String enterTime="08:00";
        String existTime="11:00";
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        try{
            Date enterDate=sdf.parse(enterTime);
            System.out.println(enterDate);
            System.out.println(enterDate.getTime());
        }catch (Exception a){
            System.out.println("error");
        }
        try{
            Date existDate=sdf.parse(existTime);
            System.out.println(existDate);
            System.out.println(existDate.getTime());
        }catch (Exception b){
            System.out.println("error");
        }
/*        Date dateIn = new Date();
        System.out.println(dateIn);
        System.out.println(dateIn.getTime());
        Date dateOut = new Date();
        long ms=3*60*60*1000;
        dateOut.setTime(dateIn.getTime()+ms);
        System.out.println(dateOut);
        System.out.println(dateOut.getTime());*/

    }
}
