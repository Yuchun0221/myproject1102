package com.yu.order;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;

    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
    }

    public int total() {
        if (delivery instanceof ShopeeDelivery) {
        } else {
            return (amount + shipFeed);
        }
        return 0;
    }
}