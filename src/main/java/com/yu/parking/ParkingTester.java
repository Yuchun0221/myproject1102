package com.yu.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParkingTester {
    public static void main(String[] args) throws ParseException {
        String id = "ABC-9876";
        String enterTime = "08:00";
        String existTime = "12:15";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        Date enterDate = null;
        Date existDate = null;
        try {
            enterDate = simpleDateFormat.parse(enterTime);
            existDate = simpleDateFormat.parse(existTime);
            System.out.println(enterDate);
            System.out.println(enterDate.getTime());
            System.out.println(existDate.getTime());
            int mins = (int)((existDate.getTime()-enterDate.getTime())/1000/60);
            System.out.println(mins);
            float fee = 0f;
            System.out.println(mins%60);
        }catch (Exception a){
            System.out.println("error");
        }


    }
}
