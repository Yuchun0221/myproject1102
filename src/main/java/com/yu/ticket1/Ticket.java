package com.yu.ticket1;

public class Ticket {
    public static final int TAIPEI_STATION=100;
    public static final int TAICHUNG_STATION=200;
    public static final int KAIHSIUNG_STATION=300;

    int start;
    int end;
    int price;
    public Ticket(int start,int end){
        this.start=start;
        this.end=end;
    }


}

