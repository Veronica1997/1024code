
//��ӡ�����к�Ϊ0��������
/*����һ���������飬��������Ƿ����һ��������Ϊ0�������顣���⣬��������������һ�������һ���������������Ϊ6��
���룺4 2 -3 -1 0 4
�����
2 5
4 4*/
import java.util.Scanner;

public class A040 {
	public static void main(String[] args) {
		int a[] = new int[6];
		Scanner input = new Scanner(System.in);
		for (int k = 0; k < a.length; k++) {
			a[k] = input.nextInt();
		}
		input.close();
		subSum(a);
	}

	public static void subSum(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}
		int start = 0;
		int end = 0;
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			start = i;
			end = i;
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				end = j;
				if (sum == 0) {
					System.out.println(start + " " + end);
				}
			}
		}
	}
}
