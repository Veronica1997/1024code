package e;

class Staff extends Employee {

	private String dept;
	private double salary;
	public Staff() {
		
	}

	public Staff(String name, int age, char sex, String dept, double salary) {
		super(name, age, sex);
		this.dept = dept;
		this.salary = salary;

	}

	public String toString() {

		return super.toString() + ",²¿ÃÅ£º" + this.dept + ",ÔÂÐ½£º" + this.salary;

	}

	public void setDept(String dept) {

		this.dept = dept;

	}

	public String getdept() {

		return dept;

	}

	public void setSalary(double salary) {

		this.salary = salary;

	}

	public double getSalary() {

		return salary;

	}

}