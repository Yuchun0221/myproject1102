package com.yu.ticketpratice;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("your start station is (1.Taipei 2.Taichung 3.Kaohsiung");
        Station startStation = null;
        int startchoice = Integer.parseInt(scanner.next());
        switch (startchoice) {
            case 1:
                startStation = Station.TAIPEI;
                break;
            case 2:
                startStation = Station.TAICHUNG;
                break;
            case 3:
                startStation = Station.KAOHSIUND;
                break;
        }
        System.out.println("your end station is (1.Taipei 2.Taichung 3.Kaohsiung");
        Station endStation = null;
        int endchoice = Integer.parseInt(scanner.next());
        switch (endchoice) {
            case 1:
                startStation = Station.TAIPEI;
                break;
            case 2:
                startStation = Station.TAICHUNG;
                break;
            case 3:
                startStation = Station.KAOHSIUND;
                break;
        }

    }
}
