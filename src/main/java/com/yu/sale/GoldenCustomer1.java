package com.yu.sale;

public class GoldenCustomer1 extends SilverCustomer1 {
    public GoldenCustomer1(String id, int amount) {
        super(id, amount);
        off = 0.2f;
    }
}
