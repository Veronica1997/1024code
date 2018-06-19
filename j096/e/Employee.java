package e;

class Employee {

	private String name;
	private int age;
	private char sex;
	public Employee() {
		
	}

	public Employee(String name, int age, char sex) {

		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String toString() {

		return "雇员姓名：" + this.name + ",年龄：" + this.age + ",性别：" + this.sex;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getName() {

		return name;

	}

	public void setAge(int age) {

		this.age = age;

	}

	public int getAge() {

		return age;

	}

	public void setSex(char sex) {

		this.sex = sex;

	}

	public char getSex() {

		return sex;

	}

}