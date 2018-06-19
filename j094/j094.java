/*构造方法与重载 建立一个汽车类 包括轮胎个数 汽车颜色 车身重量等属性。
 * 并通过不同的构造方法创建实例。 
 * 至少要求 汽车能够加速 减速 停车。 要求 命名规范 代码体现层次 有友好的操作提示。*/
class Auto {
	public int num;
	public String color;
	public double weight;
	public double speed;

	Auto() {
//无参构造
	}

	Auto(int num, String color, double weight, double speed) {//有参构造
		this.num = num;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
	}

	public void speedUp() {
		System.out.println("Auto加速");
	}

	public void speedDown() {
		System.out.println("Auto减速");
	}

	public void Stop() {
		System.out.println("Auto停车");
	}
}


public class j094 {

}
