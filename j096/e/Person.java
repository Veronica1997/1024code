package e;

public class Person {

	protected String name;
	protected String addr;
	protected char sex;
	protected int age;

	public Person(String name, String addr, char sex, int age) {
		this.addr = addr;
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	public Person(String name, String addr) {
		this.addr = addr;
		this.name = name;
	}

	public Person() {

	}

	public void print() {
		System.out.println("name=" + name + ",addr=" + addr + ",sex=" + sex + ",age=" + age);
	}
}
