package com.Pay.www;

import java.util.Scanner;

public class j103 {
    public static void main(String[] args) {
        UnionPay icbc = new ICBCImpl(2000, "123456");
        Scanner input = new Scanner(System.in);
        System.out.println("���������п�����");
        if (icbc.checkPwd(input.next())) {
            System.out.println("������Ҫȡ���");
            double sum = input.nextDouble();
            if (icbc.drawMoney(sum)) {
                System.out.println("ȡ��ɹ�,���Ϊ"+icbc.getBalance());
            }else {
                System.out.println("ȡ��ʧ��");
            }
        }
        input.close();
    }
}