package com.yu.ticket1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("your start station is (1.Taipei 2.Taichung 3.Kaohsiung");
        Station startStation = null;
        int startchoice = Integer.parseInt(scanner.next());
        switch (startchoice) {
            case 1:
                startStation = Station.TAIPEI_STATION;
                break;
            case 2:
                startStation = Station.TAICHUNG_STATION;
                break;
            case 3:
                startStation = Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("your end station is (1.Taipei 2.Taichung 3.Kaohsiung");
        Station endStation = null;
        int endchoice = Integer.parseInt(scanner.next());
        switch (endchoice) {
            case 1:
                endStation = Station.TAIPEI_STATION;
                break;
            case 2:
                endStation = Station.TAICHUNG_STATION;
                break;
            case 3:
                endStation = Station.KAOHSIUNG_STATION;
                break;
        }
        System.out.println("Which kind of ticket?(1.Normal (2.Student (3.Elder");
        Ticket ticket = null;
        int kind = Integer.parseInt(scanner.next());
        switch (kind) {
            case 1:
                ticket = new Ticket(startStation, endStation);
                break;
            case 2:
                ticket = new StudentTicket(startStation, endStation);
                break;
            case 3:
                ticket = new ElderTicket(startStation, endStation);
                break;
        }
        ticket.print();
    }
}
