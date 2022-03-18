package com.yu;

public class SilverCustomer1 extends Customer1{
    int rebate;
    public SilverCustomer1(String id,int amount){
        super(id,amount);
        this.rebate=rebate;
    }
    @Override
    public void print(){
        float offMoney=(amount/1000)*100;
        int rebate=(amount/1000)*100;
        System.out.println(id+"\t"+amount+"\t"+(amount-offMoney)+"\t"+rebate);
    }

}
