package com.yu.ticketpratice;
public class Ticket {
    Station start;
    Station end;
    int price;

    public Ticket(Station start, Station end) {
        this.start = start;
        this.end = end;
        int all = start.id + end.id;
        switch (all) {
            case 300:
                price = 500;
                break;
            case 400:
                price = 1500;
                break;
            case 500:
                price = 900;
                break;

        }
    }public void print(){
        System.out.println((start.name+"\t"+end.name+"\t"+price));
    }
}


