class kitty {
	private String name;
	private int old;
	private int weight;
	private String color;

	public kitty() {
		super();
	}

	public kitty(String name, int old, int weight, String color) {
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
		return "小猫名字为:" + name + "年龄:" + old + "重量:" + weight + "颜色:" + color;
	}
}

public class j101 {
public static void main(String[] args) {
	kitty miao=new kitty();
	miao.setColor("yellow");
	miao.setColor("little yellow");
	miao.setOld(8);
	miao.setWeight(23);
	System.out.print(miao.toString());
}
}
