package com.Pay.www;

public interface ABC extends UnionPay {
    /*增加支付电话费的功能*/
    public boolean payTellBill(String phoneNum,double sum);
}