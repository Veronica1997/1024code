//内部类得到外部类的引用示例
public class j118 {
	private int a = 201320883;
	private void funcOut() {
		System.out.println("out function run print:" + a);
	}
	
	class InnerClass { 
		private int a;
		InnerClass(int tmpa) {
			a = tmpa;
		}
		public void funcInner() {
			System.out.println("innerfunction run");
			System.out.println("a=" + a); // 内部类访问外部内的成员变量和函数()
			funcOut();
		}
	}
	
	public void print() { // 在外部类函数中创建内部类对象，调用内部类函数
		InnerClass in = new InnerClass(a);
		in.funcInner();
	}
	public static void main(String[] args) {
		j118 t = new j118();
		t.print();
	}
}
