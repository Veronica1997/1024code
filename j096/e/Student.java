package e;

public class Student extends Person {
	private int math;
	private int english;

	public Student(int math, int english) {
		this.math = math;
		this.english = english;
	}

	public Student(String name, String addr, char sex, int age, int math, int english) {
		super(name, addr, sex, age);
		this.math = math;
		this.english = english;
	}

	public Student() {
		super();
	}

	public void print() {
		System.out.println("name=" + name + ",addr=" + addr + ",sex=" + sex + ",age=" + age + ",math=" + math
				+ ",english=" + english);
	}
}