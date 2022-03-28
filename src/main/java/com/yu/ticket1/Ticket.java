package com.yu.ticket1;

public class Ticket {
    public static final int TAIPEI_STATION=100;
    public static final int TAICHUNG_STATION=200;
    public static final int KAOHSIUNG_STATION=300;

    Station start;
    Station end;
    int price;
    public Ticket(Station start,Station end){
        this.start=start;
        this.end=end;
    }



}

