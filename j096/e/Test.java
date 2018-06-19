package e;

class Cat {
	private String name;
	private int old;
	private int weight;
	private String color;

	public Cat() {
		super();
	}

	public Cat(String name, int old, int weight, String color) {
		this.name = name;
		this.old = old;
		this.weight = weight;
		this.color = color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public int getOld() {
		return old;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public String toString() {
		return "Сè����Ϊ:" + name + "����:" + old + "����:" + weight + "��ɫ:" + color;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Cat) {
			if (((Cat) obj).getName().equals(name) && ((Cat) obj).getOld() == old && ((Cat) obj).getWeight() == weight
					&& ((Cat) obj).getColor().equals(color)) {
				return true;
			}
		}
		return false;
	}
}

public class Test {
	public Test() {
		super();
	}

	public static void main(String[] args) {
		Cat cat1 = new Cat("Сè1", 2, 10, "blue");
		Cat cat2 = new Cat("Сè2", 3, 10, "red");
		Cat cat3 = new Cat("Сè1", 2, 10, "blue");
		System.out.println(cat1.equals(cat2));
		System.out.println(cat1.equals(cat3));
	}
}