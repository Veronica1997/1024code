package com.Pay.www;

public class ABCImpl implements ABC {

	private double balance;
	private String password;

	public ABCImpl(double balance, String password) {

		this.balance = balance;
		this.password = password;
	}

	@Override
	public boolean drawMoney(double number) {
		if (balance - number >= -2000) {
			balance -= number;
			return true;
		}
		return false;
	}

	@Override
	public boolean checkPwd(String input) {
		if (password.equals(input)) { 
			return true;
		}
		return false;
	}

	public boolean payTellBill(String phoneNum, double sum) {
		if (phoneNum.length() == 11 && (balance - sum) >= -2000) {
			balance -= sum;
			return true;
		}
		return false;
	}

	public double getBalance() {

		return balance;
	}

}
