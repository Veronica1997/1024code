//�̳� ����һ����������� ������һ�����ݳ�Ա ����̳и���ĸ����ݳ�Ա ͨ�����캯����ʼ������ʾ�����ݳ�Ա��ֵ��
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
