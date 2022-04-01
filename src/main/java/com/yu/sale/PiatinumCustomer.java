package com.yu.sale;

public class PiatinumCustomer extends Customer1{
    public PiatinumCustomer(String id,int amount){
        super(id, amount);
        off = 0.7f ;
    }
    @Override
    public float backMoney() {
        return (amount*Pback);
    }
    public void print(){
        System.out.println(id+"\t"+amount+"\t"+amount*off+"("+backMoney()+")");
    }
}
