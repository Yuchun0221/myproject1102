package com.yu.sale;

import com.yu.sale.Customer1;

public class SilverCustomer1 extends Customer1 {
    public SilverCustomer1(String id, int amount) {
        super(id, amount);
    }
    @Override
    public void print() {
        System.out.println(id + "\t" + amount + "\t" +
                (amount-backMoney()) +
                "(" + backMoney() + ")");
    }
}

