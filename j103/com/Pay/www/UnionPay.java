/*1.银联接口，用于描述银联统一制定的规则，该接口提供检测密码方法、取钱方法以及查询余额方法。
2.工商银行接口，用于描述工商银行发行的卡片功能，在满足银联接口的规则基础上，增加了在线支付功能。
3.农业银行接口，用于描述中国农业银行发行的卡片功能，在满足银联接口的规则基础上增加了支付电话费的功能。另外，农行的卡每月允许最多透支2000.
4.实现工商银行接口和农业银行接口，并进行测试。*/
package com.Pay.www;
/*接口：用于描述银联统一制定的规则*/
public interface UnionPay {
    /*查看余额*/
    public double getBalance();
    /*取钱*/
    public boolean drawMoney(double number);
    /*检查密码*/
    public boolean checkPwd(String input);
}
