//继承 创建一个父类和子类 父类有一个数据成员 子类继承父类的该数据成员 通过构造函数初始化并显示该数据成员的值。
class Father{
	int a;
	public Father(int a) {
		this.a=a;
	}
}
	class Son extends Father{
		public Son(int a) {
			super(a);
			System.out.println("a="+a);
		}
	}

public class j093 {
	public static void main(String[] args) {
        Son e=new Son(4);
    }
}
