package com.Pay.www;

public class ICBCImpl implements ICBC {

	private double money;
	private String pwd;

	public ICBCImpl(double money, String pwd) {
		this.money = money;
		this.pwd = pwd;
	}

	public double getBalance() {
		return money;
	}

	public boolean drawMoney(double number) {
		if (number <= money) {
			money -= number;
			return true;
		}
		return false;
	}

	public boolean checkPwd(String input) {
		if (pwd.equals(input)) {
			return true;
		}
		return false;
	}

	public void payOnline(double number) {
		if (number <= money) {
			money -= number;
		}

	}

}
