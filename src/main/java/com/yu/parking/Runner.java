package com.yu.parking;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id="ABC-1234";
        String enterTime="08:00";
        String existTime="11:15";
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        Date enterDate=null;
        try{
            enterDate=sdf.parse(enterTime);
            System.out.println(enterDate);
            System.out.println(enterDate.getTime());
        }catch (Exception a){
            System.out.println("error");
        }
        try{
            Date existDate=sdf.parse(existTime);
//            System.out.println(existDate);
//            System.out.println(existDate.getTime());
            int mins=(int)(existDate.getTime()-enterDate.getTime())/1000/60;
            System.out.println(mins);
            int fee=0;
            if (mins%60<0.25){
                fee=30*(mins/60);
            }if(0.25<=mins%60&&mins<0.5){
                fee=30*(mins/60+1/2);
            }
            else {
                fee=30*(mins/60+1);
            }
            System.out.println("Fee"+fee);
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
