package com.yu.sale;

public class DiscountCustomer extends Customer1 {
    public DiscountCustomer(String id, int amount) {
        super(id, amount);
    }

    @Override
    public void print() {
        System.out.println(id+"\t"+amount+"\t"+"\t"+(0.9*amount));
    }
}
