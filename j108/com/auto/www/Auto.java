package com.auto.www;

public class Auto {
	public int 轮胎数量;
	public String 汽车颜色;
	public double 车身重量;
	public double 速度;

	Auto() {
		// 无参构造
	}

	Auto(int 轮胎数量, String 汽车颜色, double 车身重量, double 速度) {
		// 有参构造
		this.轮胎数量 = 轮胎数量;
		this.汽车颜色 = 汽车颜色;
		this.车身重量 = 车身重量;
		this.速度 = 速度;
	}

	public void 加速() {
		System.out.println("Auto加速");
	}

	public void 减速() {
		System.out.println("Auto减速");
	}

	public void 停车() {
		System.out.println("Auto停车");
	}
}
