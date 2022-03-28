package com.yu.ticket1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int total=0;
        Ticket ticket=new Ticket(Station.TAIPEI_STATION,Station.KAOHSIUNG_STATION);
        Ticket ticket1=new Ticket(Station.TAICHUNG_STATION,Station.KAOHSIUNG_STATION);
        Ticket ticket2=new Ticket(Station.TAIPEI_STATION,Station.TAICHUNG_STATION);
        Scanner scanner=new Scanner(System.in);
        System.out.println("your start station is (1.Taipei 2.Taichung 3.Kaohsiung");
        Station startStation=null;
        int startchoice=Integer.parseInt(scanner.next());
        switch(startchoice){
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
        System.out.println("your end station is (1.Taipei 2.Taichung 3.Kaohsiung");
        Station endStation=null;
        int endchoice=Integer.parseInt(scanner.next());
        switch(endchoice) {
            case 1:
                endStation= Station.TAIPEI_STATION;
                break;
            case 2:
                endStation = Station.TAICHUNG_STATION;
                break;
            case 3:
                endStation = Station.KAOHSIUNG_STATION;
                break;
        }
        if(startchoice+endchoice==3){
            total+=600;
        }if(startchoice+endchoice==5){
            total+=900;
        }if(startchoice+endchoice==4){
            total+=1500;
        }
        System.out.println("your ticket is from"+"\t"+startStation.name+"\t"+"to"+"\t"+endStation.name);
        System.out.println("Total:"+total);
    }
}
