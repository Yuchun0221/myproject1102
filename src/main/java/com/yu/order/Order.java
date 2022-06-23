package com.yu.order;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;

    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
        int total= 0;
    }

    public int total() {

    return (amount+ delivery.price);


    }
}