//�����������fibonacci�������⣬f=fi-1+fi-2
public class j042 {
	public static void main(String[] args) {
		System.out.println("��1���µ����Ӷ�����1");
		System.out.println("��2���µ����Ӷ�����1");
		int f1 = 1, f2 = 1, f, M=12;
		for(int i=3; i<=M; i++) {
			f = f2;
			f2 = f1 + f2;
			f1 = f;
			System.out.println("��" + i +"���µ����Ӷ�����"+f2);
         }
}
}
