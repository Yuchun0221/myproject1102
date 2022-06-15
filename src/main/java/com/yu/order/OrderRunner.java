package com.yu.order;

import java.util.ArrayList;
import java.util.List;

public class OrderRunner {
    public static void main(String[] args) {
        Delivery sevenEleven = new Seven11Delivery();
        Delivery family = new FamilyDelivery();
        Delivery hiLife = new HiLifeDelivery();
        Delivery shopee = new ShopeeDelivery();
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(700, sevenEleven));
        orders.add(new Order(250, family));
        orders.add(new Order(550, hiLife));
        orders.add(new Order(220, shopee));
        orders.add(new Order(130, shopee));
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            System.out.println(order.amount + "\t" + order.delivery.name + "\t" +
                    order.delivery.price + "\t" + order.total());
        }
    }
}
