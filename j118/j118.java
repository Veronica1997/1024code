//�ڲ���õ��ⲿ�������ʾ��
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
			System.out.println("a=" + a); // �ڲ�������ⲿ�ڵĳ�Ա�����ͺ���()
			funcOut();
		}
	}
	
	public void print() { // ���ⲿ�ຯ���д����ڲ�����󣬵����ڲ��ຯ��
		InnerClass in = new InnerClass(a);
		in.funcInner();
	}
	public static void main(String[] args) {
		j118 t = new j118();
		t.print();
	}
}
