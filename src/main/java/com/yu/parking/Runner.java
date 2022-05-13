package com.yu.parking;


import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id="ABC-1234";
        Date dateIn = new Date();
        System.out.println(dateIn);
        System.out.println(dateIn.getTime());
        Date dateOut = new Date();
        System.out.println(dateOut);
        System.out.println(dateOut.getTime());
        System.out.println(dateIn.getTime()+10800000);
    }
}
