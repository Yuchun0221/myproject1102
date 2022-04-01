package com.yu.sale;

import java.util.ArrayList;
import java.util.List;

public class SalesTester1 {
    public static void main(String[] args) {
        List<Customer1>customer1s=new ArrayList<>();
        customer1s.add(new Customer1("0001",1200));
        customer1s.add(new Customer1("0002",1000));
        customer1s.add(new SilverCustomer1("0003",5000));
        customer1s.add(new GoldenCustomer1("0004",5000));
        customer1s.add(new DiscountCustomer("0005",900));
        customer1s.add(new PiatinumCustomer("0006",1000));
/*      for (int i = 0; i < 5; i++) {
            customer1s.get(i).print();
        }*/
        for(Customer1 c:customer1s){
            c.print();
        }
    }
}
