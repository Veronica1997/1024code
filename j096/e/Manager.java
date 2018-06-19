package e;

class Manager extends Employee {

	private String job;
	private double income;
	public Manager() {

	}

	public Manager(String name, int age, char sex, String job, double income) {

		super(name, age, sex);
		this.job = job;
		this.income = income;

	}

	public String toString() {

		return super.toString() + ",Ö°Î»£º" + this.job + ",ÄêÐ½£º" + this.income;

	}

	public void setJob(String job) {

		this.job = job;

	}

	public String getJob() {

		return job;

	}

	public void setIncome(double income) {

		this.income = income;

	}

	public double getIncome() {

		return income;

	}

}