package com.yu;

public class Customer1 {
    String id;
    int amount;
    public Customer1(String id,int amount){
        this.id=id;
        this.amount=amount;
    }
    public void print(){
        float offMoney=(amount/1000)*100;
        System.out.println(id+"\t"+amount+"\t"+(amount-offMoney));
    }
}
