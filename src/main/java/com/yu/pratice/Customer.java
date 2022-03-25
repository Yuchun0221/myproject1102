package com.yu.pratice;

public class Customer {
    String name;
    String level;
    int price;
    int rebate;

    public Customer(String name, String level, int price) {
        this.name = name;
        this.level = level;
        this.price = price;
        this.rebate = rebate;
    }

    public void print() {
        int total = 0;
        if (price / 1000 > 1) {
            total=price-(price/1000)*100;
            System.out.print(name + "\t" + level + "\t" + price + "\t" + total);

        }
    }
}