
//�Զ������򣬰���Ƶ�ʺ���������Ԫ��
/*����һ�����飬����Ƶ�ʺ���������Ԫ�ؽ������򡣼�
- �������Ԫ�ؾ��в�ͬ��Ƶ�ʣ���ô���и���Ƶ�ʵ�Ԫ�ؽ����ȳ��֡�
- �������Ԫ�ؾ�����ͬ��Ƶ�ʣ���ô�������ٵ�Ԫ��Ӧ�������ȳ��ֵġ�
������������Ϊ11
���룺3 3 1 1 1 8 3 6 8 7 8
�����3 3 3 1 1 1 8 8 8 6 7*/
import java.util.*;

public class A011 {
	public static void main(String[] args) {
		int a[] = new int[11];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!list.contains(a[i])) {
				list.add(a[i]);
			}
		}
		Integer[] b = list.toArray(new Integer[list.size()]);

		int[] c = new int[5];// ͳ��Ƶ��
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					c[i] += 1;
				}
			}
		}

		int temp;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length - 1 - i; j++) {
				if (c[j] < c[j + 1]) {
					temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int k = 0; k < c[i]; k++) {
				System.out.print(b[i] + " ");
			}
		}
	}
}