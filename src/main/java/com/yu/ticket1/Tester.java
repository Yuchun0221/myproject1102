package com.yu.ticket1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket=new Ticket(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);
        Ticket ticket1=new Ticket(Station.TAICHUNG_STATION,Station.KAOHSIUNG_STATION);
        Ticket ticket2=new Ticket(Station.TAIPEI_STATION,Station.TAICHUNG_STATION);
        Scanner scanner=new Scanner(System.in);
        System.out.println("your start station is (1.Taipei 2.Taichung 3.Kaohsiung");
        Station startStation=null;
        int choice=Integer.parseInt(scanner.next());
        switch(choice){
            case 1:
                startStation=Station.TAIPEI_STATION;
                break;
            case 2:
                startStation=Station.TAIPEI_STATION;
                break;
            case 3:
                startStation=Station.TAIPEI_STATION;
                break;
        }
    }
}
