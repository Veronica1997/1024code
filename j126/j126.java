//����һ�������±�Խ����쳣��
public class j126 {
	public static void main(String args[]) {
		String[] str = { "1", "2" };
		try {
			System.out.println(str[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ��");
		}
	}
}
