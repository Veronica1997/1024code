package com.Pay.www;

import java.util.Scanner;

public class j103 {
    public static void main(String[] args) {
        UnionPay icbc = new ICBCImpl(2000, "123456");
        Scanner input = new Scanner(System.in);
        System.out.println("请输入银行卡密码");
        if (icbc.checkPwd(input.next())) {
            System.out.println("请输入要取金额");
            double sum = input.nextDouble();
            if (icbc.drawMoney(sum)) {
                System.out.println("取款成功,余额为"+icbc.getBalance());
            }else {
                System.out.println("取款失败");
            }
        }
        input.close();
    }
}